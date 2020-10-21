package com.crazyandcoder.top.jetpackdemojava.jetpack.lifecycle;

import androidx.lifecycle.LifecycleService;

public class LifecycleServiceTest extends LifecycleService {

    private MyServiceObserver myServiceObserver;

    public LifecycleServiceTest() {
        myServiceObserver = new MyServiceObserver();
        getLifecycle().addObserver(myServiceObserver);
    }
}
