package com.sz21c.mock.constructor;

public class BusinessCard {

    public BusinessCard() {

    }

    public String getBusinessName() {
        Profile profile = new Profile();
        return profile.getName() + " Willson";
    }

    public Profile getProfile() {
        Profile profile = new Profile();
        return profile;
    }
}
