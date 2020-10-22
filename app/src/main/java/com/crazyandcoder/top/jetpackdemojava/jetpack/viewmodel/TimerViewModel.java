package com.crazyandcoder.top.jetpackdemojava.jetpack.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.crazyandcoder.top.jetpackdemojava.utils.LogUtils;

import java.util.Timer;
import java.util.TimerTask;

public class TimerViewModel extends  ViewModel {


    private Timer timer;
    private int currentSecond;
    private OnTimeChangeListener listener;



    public void startTiming() {
        if (timer == null) {
            timer = new Timer();
            currentSecond = 0;
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    currentSecond++;
                    if (listener != null) {
                        listener.onTimeChange(currentSecond);
                    }
                }
            };
            timer.schedule(task, 1000, 1000);
        }
    }

    public void setOnTimeChangeListener(OnTimeChangeListener listener) {
        this.listener = listener;
    }

    public interface OnTimeChangeListener {
        void onTimeChange(int second);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (timer != null) {
            timer.cancel();
        }
        LogUtils.d("ViewModel >onCleared");
    }
}
