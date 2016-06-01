package com.example.databinding.databindingapplication.holder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.databinding.databindingapplication.databinding.LayoutSexBinding;

/**
 * Created by yangshuai in the 21:23 of 2016.06.01 .
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private LayoutSexBinding mBinding;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mBinding = LayoutSexBinding.bind(itemView);
    }

    public ViewDataBinding getBinding() {
        return mBinding;
    }

}
