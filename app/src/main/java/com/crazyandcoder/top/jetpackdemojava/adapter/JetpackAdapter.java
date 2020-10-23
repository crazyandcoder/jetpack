package com.crazyandcoder.top.jetpackdemojava.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.crazyandcoder.top.jetpackdemojava.R;
import com.crazyandcoder.top.jetpackdemojava.bean.JetpackItemBean;

import java.util.List;

public class JetpackAdapter extends RecyclerView.Adapter<JetpackAdapter.JetpackViewHolder> {

    private List<JetpackItemBean> data;
    private OnItemClickListener listener;

    public JetpackAdapter(List<JetpackItemBean> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public JetpackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_item_jetpack, parent, false);
        return new JetpackViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JetpackViewHolder holder, final int position) {
        holder.itemTv.setText("" + data.get(position).getName());
        holder.itemTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onClick(position, data.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class JetpackViewHolder extends RecyclerView.ViewHolder {

        private TextView itemTv;

        public JetpackViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTv = itemView.findViewById(R.id.itemView);
        }

    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onClick(int position, JetpackItemBean item);
    }
}
