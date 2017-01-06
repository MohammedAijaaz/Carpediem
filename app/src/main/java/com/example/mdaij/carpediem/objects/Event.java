package com.example.mdaij.carpediem.objects;

import java.util.Date;

/**
 * Created by mdaij on 12/21/2016.
 */
public class Event {
    public String eventName;
    public String startTime;
    public String endTime;
    public String date;
    public String cost;

    public Event(){

    }

    public Event(String eventName, String startTime, String endTime, String date, String cost) {
        this.eventName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.cost = cost;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
