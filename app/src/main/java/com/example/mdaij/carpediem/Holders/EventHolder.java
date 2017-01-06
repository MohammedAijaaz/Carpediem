package com.example.mdaij.carpediem.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mdaij.carpediem.R;

/**
 * Created by mdaij on 1/6/2017.
 */
public class EventHolder extends RecyclerView.ViewHolder{
    private TextView eventName, eventDate, eventCost;

    public EventHolder(View itemView) {
        super(itemView);
        eventName = (TextView)itemView.findViewById(R.id.itemEventNameId);
        eventDate = (TextView)itemView.findViewById(R.id.itemEventDateId);
        eventCost = (TextView)itemView.findViewById(R.id.itemEventCostId);
    }

    public void setEventName(String name) {
        eventName.setText(name);
    }

    public void setEventDate(String date) {
        eventDate.setText(date);
    }

    public void setEventCost(String cost) {
        eventCost.setText(cost);
    }
}
