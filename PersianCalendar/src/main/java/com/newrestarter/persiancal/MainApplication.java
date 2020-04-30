package com.newrestarter.persiancal;

import android.app.Application;

import com.newrestarter.persiancal.util.Utils;


public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();



        Utils.initUtils(getApplicationContext());

    }
}
