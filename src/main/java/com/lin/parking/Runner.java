package com.lin.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        //String id = "13545747t6d6g3";
        String enterTime = "08:00";
        String exitTime = "11:05";
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");
        Date d = null;

        try {
             d = sdf.parse(enterTime);
        } catch (Exception e) {
            System.out.println("wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        //long ms = 3*60*60*1000;
        try {
            Date d2 = sdf.parse(exitTime);
            //d2.setTime(d.getTime() + ms);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int min = ((int)(d2.getTime() - d.getTime())/1000/60);
            System.out.println(min);
            int fee = 30*(min/60);
            System.out.println("Fee:" + fee);
            //3:14 => NTD$90 , 3:15 => NTD$120
            //3:15-3:30 => NTD$105
        } catch (Exception e) {
            System.out.println("exit wrong format");
        }
    }

}
