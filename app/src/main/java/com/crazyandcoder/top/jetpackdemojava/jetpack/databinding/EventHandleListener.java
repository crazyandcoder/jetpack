package com.crazyandcoder.top.jetpackdemojava.jetpack.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class EventHandleListener {
    private Context context;
    private View.OnClickListener listener;

    public EventHandleListener(Context context, View.OnClickListener listener) {
        this.context = context;
        this.listener = listener;
    }

    public void onButtonClicked(View view) {
        view.setOnClickListener(listener);
    }
}
