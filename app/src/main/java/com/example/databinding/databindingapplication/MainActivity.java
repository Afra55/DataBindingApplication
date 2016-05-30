package com.example.databinding.databindingapplication;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ViewStubProxy;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import com.afra55.CusstomMainBinding;
import com.example.databinding.databindingapplication.databinding.TestViewstubBinding;

import java.util.ArrayList;
import java.util.List;

// default name
//import com.example.databinding.databindingapplication.databinding.ActivityMainBinding;
// rename CusstomMainBinding
//import com.example.databinding.databindingapplication.databinding.CusstomMainBinding;
// change package
//import com.example.databinding.databindingapplication.CusstomMainBinding;
// cusstom full binding data class package

public class MainActivity extends AppCompatActivity {

    // private ActivityMainBinding mBinding;

    // cusstom package
    private CusstomMainBinding mBinding;
    private List<User> mUserList;
    private User mUser;
    private Son mSon;
    private ObservableArrayMap<String, Object> mMap;
    private ObservableArrayList<Object> mList;
    private ViewStubProxy mViewStubProxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUserList = new ArrayList<>();
        initUserData();
        initSonData();

        mUserList.add(mUser);
        mBinding.setUser(mUser);
        mBinding.setSon(mSon);
        mBinding.setHandlers(new MyHandlers());
        mBinding.setUserList(mUserList);
        mBinding.setMap(initMap());
        mBinding.setList(initList());

        mBinding.idsTv.setText("IDS Text OK");

        mBinding.viewstub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                TestViewstubBinding viewDataBinding = DataBindingUtil.bind(inflated);
                User user = new User("xx", "gg", true);
                viewDataBinding.setUser(user);
            }
        });

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

    private ObservableArrayMap initMap() {
        mMap = new ObservableArrayMap<>();
        mMap.put("company", "home");
        mMap.put("email", "a@a.com");
        return mMap;
    }

    private ObservableArrayList initList() {
        mList = new ObservableArrayList<>();
        mList.add("I");
        mList.add(11111111);
        return mList;
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

            mMap.put("email", "b@b.com");

            mList.clear();
            mList.add("You");
            mList.add("5656565");

            mBinding.idsTv.setText("IDS Text OK, I can change");

            if (!mBinding.viewstub.isInflated()) {
                mBinding.viewstub.getViewStub().inflate();
            }

            return false;
        }
    });
}
