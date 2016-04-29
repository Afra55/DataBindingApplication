package com.example.databinding.databindingapplication;

/**
 * Created by yangshuai in the 22:50 of 2016.04.28 .
 */
public class User {

    private final String firstName;
    private final String lastName;
    private final boolean isFriends;

    public User(String firstName, String lastName,boolean isFriends) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isFriends = isFriends;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public boolean getIsFriends() {
        return isFriends;
    }
}
