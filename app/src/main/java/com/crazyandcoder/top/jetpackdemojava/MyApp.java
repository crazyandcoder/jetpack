package com.crazyandcoder.top.jetpackdemojava;

import android.app.Application;

import com.socks.library.KLog;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(true, "liji-jetpack");
    }
}
