package com.zbq000_Test.Test001_JiSuanYuanWeek_20190505;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TestYuanWeek
 * Create by 朱步青 on 2019/5/5
 */
public class TestYuanWeek {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = simpleDateFormat.format(date);
        String[] yearMonthDay = nowDate.split("-");
        int year = Integer.valueOf(yearMonthDay[0]);
        int month = Integer.valueOf(yearMonthDay[1]);
        int day = Integer.valueOf(yearMonthDay[2]);
        int runDayNum = 0;
        for (int i = 1; i < year; i++) {
            if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) {
                runDayNum++;
            }
        }
        int allDayNums = (year - 1) * 365 + runDayNum + day;
        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                allDayNums += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                allDayNums += 30;
            } else {
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                    allDayNums += 29;
                } else {
                    allDayNums += 28;
                }
            }
        }
        String week = String.valueOf(8 - allDayNums % 7);
        if (week.equals("8")) {
            week = "1";
        }

        System.out.println("元年元月元日是周" + week);
    }
}
