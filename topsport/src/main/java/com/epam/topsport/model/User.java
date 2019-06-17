package com.epam.topsport.model;

import java.io.File;

public class User {
    private String email;
    private int password;
    private String nickname;
    private String fullName;
    private String picture;

    public User(String email, int password, String nickname, String fullName, String picture) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.fullName = fullName;
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password=" + password +
                ", nickname='" + nickname + '\'' +
                ", fullName='" + fullName + '\'' +
                ", picture=" + picture +
                '}';
    }
}
