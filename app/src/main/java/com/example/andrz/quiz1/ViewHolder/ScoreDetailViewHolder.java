package com.example.andrz.quiz1.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.andrz.quiz1.R;

public class ScoreDetailViewHolder extends RecyclerView.ViewHolder {

    public TextView txt_name,txt_score;


    public ScoreDetailViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_name = (TextView)itemView.findViewById(R.id.txt_name1);
        txt_score = (TextView)itemView.findViewById(R.id.txt_score1);
    }
}
