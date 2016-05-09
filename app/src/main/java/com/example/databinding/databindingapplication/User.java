package com.example.databinding.databindingapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.databinding.databindingapplication.BR;

/**
 * Created by yangshuai in the 22:50 of 2016.04.28 .
 */
public class User extends BaseObservable{

    private String firstName;
    private String lastName;
    private boolean isFriends;
    private String sex;
    private String interesting;

    public User(String firstName, String lastName,boolean isFriends) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isFriends = isFriends;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public boolean getIsFriends() {
        return isFriends;
    }

    public void setIsFriends(boolean isFriends) {
        this.isFriends = isFriends;
        notifyPropertyChanged(BR.isFriends);
    }

    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(BR.sex);
    }

    @Bindable
    public String getInteresting() {
        return interesting;
    }

    public void setInteresting(String interesting) {
        this.interesting = interesting;
        notifyPropertyChanged(BR.interesting);
    }
}
