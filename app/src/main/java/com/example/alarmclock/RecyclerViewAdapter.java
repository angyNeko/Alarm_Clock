package com.example.alarmclock;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView alarmTime, ampm, everyWhen;
        CardView alarmCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            alarmTime = itemView.findViewById(R.id.alarmTime);
            ampm = itemView.findViewById(R.id.ampm);
            everyWhen = itemView.findViewById(R.id.everyWhen);
            alarmCard = itemView.findViewById(R.id.alarmCard);

        }
    }
}
