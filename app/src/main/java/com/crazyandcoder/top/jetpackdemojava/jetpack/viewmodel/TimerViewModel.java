package com.crazyandcoder.top.jetpackdemojava.jetpack.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.crazyandcoder.top.jetpackdemojava.utils.LogUtils;

import java.util.Timer;
import java.util.TimerTask;

public class TimerViewModel extends ViewModel {


    private Timer timer;
    private OnTimeChangeListener listener;

    private MutableLiveData<Integer> currentSecond;

    public LiveData<Integer> getCurrentSecond() {
        if (currentSecond == null) {
            currentSecond = new MutableLiveData<>();
        }
        return currentSecond;
    }


    public void startTiming() {
        if (timer == null) {
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
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
