package com.example.databinding.databindingapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.databindingapplication.BR;
import com.example.databinding.databindingapplication.R;
import com.example.databinding.databindingapplication.User;
import com.example.databinding.databindingapplication.holder.RecyclerViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangshuai in the 21:21 of 2016.06.01 .
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private Context mContext;
    private List<User> mUsers = new ArrayList<>();

    public RecyclerViewAdapter(Context context, List<User> users) {
        mContext = context;
        mUsers.addAll(users);
    }

    public void updata(List<User> users) {
        mUsers.addAll(users);
        notifyDataSetChanged();
    }

    public void clear() {
        mUsers.clear();
        notifyDataSetChanged();
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_sex, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.getBinding().setVariable(BR.user, mUsers.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }
}
