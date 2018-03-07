package com.odbpo.fenggou.smartrefreshlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SmartRefreshLayout refreshLayout;
    RecyclerView rv;
    private List<String> mData = new ArrayList<>();
    int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshLayout = (SmartRefreshLayout) findViewById(R.id.refreshLayout);
        refreshLayout.setEnableLoadmore(false);
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RvAdapter(mData));

        refreshLayout.autoRefresh();
        refreshLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() {

            @Override
            public void onRefresh(RefreshLayout refreshlayout) {//下拉刷新
                page = 1;
                mData.clear();
                for (int i = 1; i <= 20; i++) {
                    mData.add("页数" + page + " 初始条目 " + i);
                }
                rv.getAdapter().notifyDataSetChanged();
                refreshLayout.finishRefresh();
                refreshLayout.setEnableLoadmore(true);
                refreshLayout.setLoadmoreFinished(false);
                page++;
            }

            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {//上拉加载
                if (page <= 3) {//加载完成
                    for (int i = 1; i <= 10; i++) {
                        mData.add("页数" + page + " 加载条目 " + i);
                    }
                    rv.getAdapter().notifyDataSetChanged();
                    refreshLayout.finishLoadmore();
                    page++;
                } else {//没有更多数据
                    rv.getAdapter().notifyDataSetChanged();
                    refreshLayout.finishLoadmore();
                    refreshLayout.setLoadmoreFinished(true);
                }

            }

        });
    }
}
