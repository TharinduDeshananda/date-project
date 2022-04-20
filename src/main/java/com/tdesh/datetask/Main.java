package com.tdesh.datetask;


import jdk.swing.interop.SwingInterOpUtils;
import org.javatuples.Pair;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args){
//        Calendar st1 = Calendar.getInstance();
//        Calendar st2 = Calendar.getInstance();
//        st1.set(2022,0,10);
//        st2.set(2023,0,17);
//
//        List weekList = DateUtils.getWeeksWithingRange(st1,st2,true);
//        System.out.println(weekList);


//        LocalDate st1 = new LocalDate(2022,1,3);
//        LocalDate st2 = new LocalDate(2022,1,18);
//
//        System.out.println(DateUtils.getDaysWithingRange(st1,st2, DateTimeConstants.WEDNESDAY));


      Calendar st1 = Calendar.getInstance();
      Calendar st2 = Calendar.getInstance();
      st1.set(2022,0,3);
        st2.set(2022,0,17);
        List<Pair<Calendar,Calendar>> pairs = DateUtils.getWeeksList(st1,st2);
        for (Pair<Calendar,Calendar> pair:pairs
             ) {
            System.out.println(pair.getValue0().get(Calendar.DAY_OF_YEAR)+" - "+pair.getValue1().get(Calendar.DAY_OF_YEAR));
        }









    }

}
