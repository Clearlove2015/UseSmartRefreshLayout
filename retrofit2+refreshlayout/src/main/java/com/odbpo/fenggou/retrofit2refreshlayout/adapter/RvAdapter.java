package com.odbpo.fenggou.retrofit2refreshlayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.odbpo.fenggou.retrofit2refreshlayout.R;
import com.odbpo.fenggou.retrofit2refreshlayout.bean.Course;
import com.odbpo.fenggou.retrofit2refreshlayout.util.AppToast;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author: zc
 * @Time: 2018/3/7 10:15
 * @Desc:
 */
public class RvAdapter extends RecyclerView.Adapter {
    private List<Course.DataBean> mData;
    private Context context;

    public RvAdapter(List<Course.DataBean> mData) {
        this.mData = mData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_rv, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder itemHolder = (ItemViewHolder) holder;
        itemHolder.tvName.setText(mData.get(position).getName());
        itemHolder.tvTeacher.setText("教师：" + mData.get(position).getTeacher().getName());
        Glide.with(context).load(mData.get(position).getImage()).into(itemHolder.ivImage);

        itemHolder.itemView.setOnClickListener(new ItemClickListener(position));
        itemHolder.tvShare.setOnClickListener(new ItemClickListener(position));
        itemHolder.tvDetail.setOnClickListener(new ItemClickListener(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.itemView)
        LinearLayout itemView;
        @Bind(R.id.iv_image)
        ImageView ivImage;
        @Bind(R.id.tv_name)
        TextView tvName;
        @Bind(R.id.tv_teacher)
        TextView tvTeacher;
        @Bind(R.id.tv_detail)
        TextView tvDetail;
        @Bind(R.id.tv_share)
        TextView tvShare;

        public ItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class ItemClickListener implements View.OnClickListener {
        Gson gson = new Gson();
        int position;

        public ItemClickListener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.itemView:
                    AppToast.show("ItemClick");
                    break;
                case R.id.tv_share:
                    AppToast.show(mData.get(position).getName());
                    break;
                case R.id.tv_detail:
                    AppToast.show(gson.toJson(mData.get(position)));
                    break;
            }
        }
    }

}
