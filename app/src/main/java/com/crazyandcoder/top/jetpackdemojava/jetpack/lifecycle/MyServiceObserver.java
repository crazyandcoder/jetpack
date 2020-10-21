package com.crazyandcoder.top.jetpackdemojava.jetpack.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.crazyandcoder.top.jetpackdemojava.utils.LogUtils;

public class MyServiceObserver implements LifecycleObserver {


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void startLocation() {
        LogUtils.d("LifeCycle-MyServiceObserver startLocation => ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void stopLocation() {
        LogUtils.d("LifeCycle-MyServiceObserver startLocation => ON_DESTROY");
    }
}
