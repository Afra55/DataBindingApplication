package com.example.databinding.databindingapplication;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databinding.databindingapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Victor", "Yang", true);
        mBinding.setUser(user);
        handler.sendEmptyMessageDelayed(0, 1000);
    }

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            User user1 = new User("Afra55", "Yang", false);
            mBinding.setUser(user1);
            return false;
        }
    });
}
