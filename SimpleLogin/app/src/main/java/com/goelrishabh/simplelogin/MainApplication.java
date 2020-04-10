package com.goelrishabh.simplelogin;

import android.app.Application;

public class MainApplication extends Application {

    private static final String TAG = "MainApplication";

    private static MainApplication mainApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mainApplication = this;
    }
    
    public static MainApplication getMainApplication() {
        return mainApplication;
    }

}
