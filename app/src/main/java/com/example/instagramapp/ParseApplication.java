package com.example.instagramapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5UuDuSp50nwrqJQa2WlpoFpUfjyuIwnqTkQOGBCt")
                .clientKey("Cf9jl2pDM0tWmIdD7E8QjfikXOqZNUHjQg9gusU0")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
