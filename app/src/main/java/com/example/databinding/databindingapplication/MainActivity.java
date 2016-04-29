package com.example.databinding.databindingapplication;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databinding.databindingapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private List<User> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mList = new ArrayList<>();
        User user = new User("Victor", "Yang", true);
        mList.add(user);
        mBinding.setUser(user);
        mBinding.setHandlers(new MyHandlers());
        mBinding.setUserList(mList);
        handler.sendEmptyMessageDelayed(0, 5000);
    }

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            User user1 = new User("Afra55", "Yang", false);
            mList.add(user1);
            mBinding.setUser(user1);
            mBinding.setUserList(mList);
            return false;
        }
    });
}
