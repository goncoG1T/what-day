package com.goncoG1T.application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Program {
    public static void main(String []args) {
        Locale.setDefault(Locale.US);

        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatHour = new SimpleDateFormat("HH:mm:ss");

        SimpleDateFormat formatDay = new SimpleDateFormat("EEEEEE");

        Date today = new Date();

        String date = formatDate.format(today);
        String hour = formatHour.format(today);
        String complete = today.toString();

        //today + 1
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_WEEK, 1);
        Date todayPlus = calendar.getTime();

        String tomorrow = formatDay.format(todayPlus);

        System.out.printf("Today is: %s, hour: %s and tomorrow will be: %s.\n", date, hour, tomorrow);
        System.out.println("All infos.: " + complete);


    }
}
