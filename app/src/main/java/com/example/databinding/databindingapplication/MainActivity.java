package com.example.databinding.databindingapplication;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// default name
//import com.example.databinding.databindingapplication.databinding.ActivityMainBinding;

// rename CusstomMainBinding
//import com.example.databinding.databindingapplication.databinding.CusstomMainBinding;

// change package
//import com.example.databinding.databindingapplication.CusstomMainBinding;

// cusstom full binding data class package
import com.afra55.CusstomMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // private ActivityMainBinding mBinding;

    // cusstom package
    private CusstomMainBinding mBinding;
    private List<User> mList;
    private User mUser;
    private Son mSon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mList = new ArrayList<>();
        initUserData();
        initSonData();

        mList.add(mUser);
        mBinding.setUser(mUser);
        mBinding.setSon(mSon);
        mBinding.setHandlers(new MyHandlers());
        mBinding.setUserList(mList);
        handler.sendEmptyMessageDelayed(0, 5000);
    }

    private User initUserData() {
        mUser = new User("Victor", "Yang", true);
        mUser.setSex("man");
        mUser.setIsFriends(true);
        mUser.setInteresting("eat");
        return mUser;
    }

    private Son initSonData() {
        mSon = new Son();
        mSon.firstName.set("Bear");
        mSon.lastName.set("Child");
        mSon.age.set(5);
        return mSon;
    }

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            mUser.setFirstName("Afra55");
            mUser.setLastName("LuVicy");
            mUser.setSex("woman");
            mUser.setInteresting("sleep");
            mUser.setIsFriends(false);

            mSon.age.set(100);
            return false;
        }
    });
}
