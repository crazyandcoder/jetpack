package com.crazyandcoder.top.jetpackdemojava.jetpack.lifecycle;

import android.content.Context;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.crazyandcoder.top.jetpackdemojava.utils.LogUtils;
import com.socks.library.KLog;

public class MyLocationListener implements LifecycleObserver {

    public MyLocationListener(Context context, OnLocationChangeListener locationChangeListener) {
        LogUtils.d("LifeCycle-MyLocationListener constructor");
        initLocationManager();
    }

    private void initLocationManager() {
        LogUtils.d("LifeCycle-MyLocationListener initLocationManager");

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void startLocation() {
        LogUtils.d("LifeCycle-MyLocationListener startLocation => ON_RESUME");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void stopLocation() {
        LogUtils.d("LifeCycle-MyLocationListener startLocation => ON_PAUSE");
    }

    public interface OnLocationChangeListener {
        void onChange(double lat, double lng);
    }

}
