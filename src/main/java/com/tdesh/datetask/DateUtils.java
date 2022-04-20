package com.tdesh.datetask;


import jdk.swing.interop.SwingInterOpUtils;
import org.javatuples.Pair;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DateUtils {

    public static List<Integer> getWeeksWithingRange(Calendar startDate,Calendar endDate,boolean continues){
        if(startDate.after(endDate))return null;
        Calendar start = Calendar.getInstance();
        start.set(startDate.get(Calendar.YEAR),0,1);

        startDate.setFirstDayOfWeek(start.get(Calendar.DAY_OF_WEEK));

        List<Integer> weekList = new ArrayList<>();
        int yearCounter=0;
        while(startDate.before(endDate)){
            int week = startDate.get(Calendar.WEEK_OF_YEAR)+yearCounter*52;
            if (week==52&&continues)++yearCounter;
            weekList.add(week);
            startDate.add(Calendar.WEEK_OF_YEAR,1);

        }

        return weekList;
    }

    public static List<LocalDate> getDaysWithingRange(LocalDate startDate, LocalDate endDate, int dayOfWeek){
        if(startDate.isAfter(endDate))return null;
//        LocalDate weekDay = startDate.withDayOfWeek(DateTimeConstants.MONDAY);
        LocalDate weekDay = startDate.withDayOfWeek(dayOfWeek);

        if (startDate.isAfter(weekDay)) {
            startDate = weekDay.plusWeeks(1); // start on next monday
        } else {
            startDate = weekDay; // start on this monday
        }

        List<LocalDate> daysList = new ArrayList<>();

        while (startDate.isBefore(endDate)) {
            System.out.println(startDate);
            daysList.add(startDate);
            startDate = startDate.plusWeeks(1);
        }
        return daysList;
    }


    public static List<Pair<Calendar,Calendar>> getWeeksList(Calendar startDate,Calendar endDate){
        if(startDate.after(endDate))return null;
        Calendar start = Calendar.getInstance();
        start.set(startDate.get(Calendar.YEAR),0,1);

        start.setFirstDayOfWeek(start.get(Calendar.DAY_OF_WEEK));

        startDate.setFirstDayOfWeek(start.get(Calendar.DAY_OF_WEEK));
        int startWeek = startDate.get(Calendar.WEEK_OF_YEAR);


        start.add(Calendar.WEEK_OF_YEAR,startWeek-1);

        List<Pair<Calendar,Calendar>> weekPairs = new ArrayList<>();
        while(start.before(endDate)){
            Calendar st1 = (Calendar) start.clone();
            Calendar st2 = (Calendar) start.clone();
            st2.add(Calendar.WEEK_OF_YEAR,1);
            Pair<Calendar,Calendar> pair = new Pair<Calendar,Calendar>(st1,st2);
            weekPairs.add(pair);
            start.add(Calendar.WEEK_OF_YEAR,1);
        }



        System.out.println("start week"+startWeek);



        return weekPairs;
    }

}
