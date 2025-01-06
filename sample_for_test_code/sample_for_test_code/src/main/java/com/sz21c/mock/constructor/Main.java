package com.sz21c.mock.constructor;

public class Main {

    public String getName() {
        Profile profile = new Profile();
        return profile.getName() + " is a good guy";
    }

    public String getBusinessName() {
        BusinessCard businessCard = new BusinessCard();
        return businessCard.getBusinessName();
    }

    public String getNameFromProfile() {
        BusinessCard businessCard = new BusinessCard();
        Profile profile = businessCard.getProfile();
        return profile.getName();
    }
}
