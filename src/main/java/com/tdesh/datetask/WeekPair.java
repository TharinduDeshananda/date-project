package com.tdesh.datetask;


import java.util.ArrayList;
import java.util.List;

public class WeekPair {
    private int startWeek;
    private int endWeek;
//    private List<Integer> weeks=new ArrayList<>();

    public WeekPair() {
    }

    public WeekPair(int startWeek, int endWeek) {
        this.startWeek = startWeek;
        this.endWeek = endWeek;
    }

    public int getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(int startWeek) {
        this.startWeek = startWeek;
    }

    public int getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(int endWeek) {
        this.endWeek = endWeek;
    }

    @Override
    public String toString() {
        return "WeekPair{" +
                "startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                '}';
    }
}
