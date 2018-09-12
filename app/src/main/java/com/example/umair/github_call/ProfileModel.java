package com.example.umair.github_call;

public class ProfileModel {
   private int profileImageId;
   private String profileUserName;

    public ProfileModel(int profileImageId, String profileUserName) {
        this.profileImageId = profileImageId;
        this.profileUserName = profileUserName;
    }

    public int getProfileImageId() {
        return profileImageId;
    }

    public void setProfileImageId(int profileImageId) {
        this.profileImageId = profileImageId;
    }

    public String getProfileUserName() {
        return profileUserName;
    }

    public void setProfileUserName(String profileUserName) {
        this.profileUserName = profileUserName;
    }
}
