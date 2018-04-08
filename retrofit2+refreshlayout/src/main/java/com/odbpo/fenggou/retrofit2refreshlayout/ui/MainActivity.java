package com.odbpo.fenggou.retrofit2refreshlayout.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.odbpo.fenggou.retrofit2refreshlayout.R;
import com.odbpo.fenggou.retrofit2refreshlayout.adapter.RvAdapter;
import com.odbpo.fenggou.retrofit2refreshlayout.bean.Course;
import com.odbpo.fenggou.retrofit2refreshlayout.net.Net;
import com.odbpo.fenggou.retrofit2refreshlayout.util.AppToast;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv)
    RecyclerView rv;
    @Bind(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;

    private List<Course.DataBean> mData = new ArrayList<>();
    private List<Course.DataBean> tempData = new ArrayList<>();
    private RvAdapter rvAdapter;
    private int page = 1;
    private int pageLimite = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        initRecyclerView();
        initRefreshLayout();
    }

    public void initData() {
        page = 1;
        requestCourse(false);
    }

    public void initRecyclerView() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        rvAdapter = new RvAdapter(mData);
        rv.setAdapter(rvAdapter);
    }

    public void initRefreshLayout() {
        refreshLayout.setEnableLoadmore(false);
        refreshLayout.setEnableAutoLoadmore(false);//是否启用列表惯性滑动到底部时自动加载更多
        refreshLayout.setDisableContentWhenRefresh(true);//是否在刷新的时候禁止内容的一切手势操作（默认false）
        refreshLayout.setDisableContentWhenLoading(true);//是否在加载的时候禁止内容的一切手势操作（默认false）
        refreshLayout.setEnableLoadmoreWhenContentNotFull(false);//是否在列表不满一页时候开启上拉加载功能
        refreshLayout.setEnableFooterFollowWhenLoadFinished(false);//是否在全部加载结束之后Footer跟随内容
        //refreshLayout.autoRefresh();//自动刷新
        refreshLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() {

            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                page = 1;
                requestCourse(false);
            }

            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                requestCourse(true);
            }
        });
    }

    public void requestCourse(final boolean isLoadMore) {
        Net.getApiClient().getCourseList(page, pageLimite)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Course>() {

                    @Override
                    public void onNext(Course course) {
                        tempData.clear();
                        tempData.addAll(course.getData());
                    }

                    @Override
                    public void onError(Throwable e) {
                        AppToast.show(e.getMessage());
                    }

                    @Override
                    public void onCompleted() {
                        handRefreshOrLoad(isLoadMore);
                    }
                });
    }

    public void handRefreshOrLoad(final boolean isLoadMore) {
        if (!isLoadMore) {//下拉刷新
            mData.clear();
            refreshLayout.finishRefresh();
            refreshLayout.setEnableLoadmore(true);
            refreshLayout.setLoadmoreFinished(false);
            page++;
        } else {//上拉加载
            if (tempData.size() < pageLimite) {//没有更多数据
                refreshLayout.finishLoadmore();//结束加载
                refreshLayout.setLoadmoreFinished(true);
            } else {//加载完成
                refreshLayout.finishLoadmore();
                page++;
            }
        }

        mData.addAll(tempData);
        rvAdapter.notifyDataSetChanged();

    }

}
