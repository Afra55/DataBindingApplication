package com.example.databinding.databindingapplication;

/**
 * Created by yangshuai in the 22:50 of 2016.04.28 .
 */
public class User {

    private final String firstName;
    private final String lastName;
    private final boolean isFriends;
    private String sex;
    private String interesting;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInteresting() {
        return interesting;
    }

    public void setInteresting(String interesting) {
        this.interesting = interesting;
    }
}
