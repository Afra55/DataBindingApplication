package com.example.databinding.databindingapplication;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Victor Yang on 2016/4/29.
 * 事件处理
 */
public class MyHandlers {

    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
    }
    public void onClickEnemy(View view) {
        Toast.makeText(view.getContext(), "onClickEnemy", Toast.LENGTH_SHORT).show();
    }
}
