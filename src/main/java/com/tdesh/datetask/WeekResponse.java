package com.tdesh.datetask;

import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WeekResponse {

    WeekPair weekPair;
    List<Pair<Calendar,Calendar>> weekList = new ArrayList<>();

    public WeekResponse() {
    }

    public WeekResponse(WeekPair weekPair, List<Pair<Calendar, Calendar>> weekList) {
        this.weekPair = weekPair;
        this.weekList = weekList;
    }

    public WeekPair getWeekPair() {
        return weekPair;
    }

    public void setWeekPair(WeekPair weekPair) {
        this.weekPair = weekPair;
    }

    public List<Pair<Calendar, Calendar>> getWeekList() {
        return weekList;
    }

    public void setWeekList(List<Pair<Calendar, Calendar>> weekList) {
        this.weekList = weekList;
    }

    @Override
    public String toString() {
        return "WeekResponse{" +
                "weekPair=" + weekPair +
                ", weekList=" + weekList +
                '}';
    }
}
