package com.zbq.zDate;

import java.util.Calendar;

/**
 * 时间日期
 */
public class ZCalendar {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        // 获得年份
        int year = c1.get(Calendar.YEAR);
        System.out.println(year);
        // 获得月份
        int month = c1.get(Calendar.MONTH) + 1;
        System.out.println(month);
        // 获得日期
        int date = c1.get(Calendar.DATE);
        System.out.println(date);
        // 获得小时
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        // 获得分钟
        int minute = c1.get(Calendar.MINUTE);
        System.out.println(minute);
        // 获得秒
        int second = c1.get(Calendar.SECOND);
        System.out.println(second);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c1.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);

        System.out.println("********************************");

        Calendar cA = Calendar.getInstance();
        cA.set(2017, 2, 1);
        System.out.println(cA.get(Calendar.YEAR) + "-" + cA.get(Calendar.MONTH) + "-" + cA.get(Calendar.DATE));
        cA.set(2017, 2, 0);
        System.out.println(cA.get(Calendar.YEAR) + "-" + cA.get(Calendar.MONTH) + "-" + cA.get(Calendar.DATE));

        System.out.println("********************************");

        Calendar cB = Calendar.getInstance();
        cB.set(2017, 2, 1);
        System.out.println(cB.get(Calendar.YEAR) + "-" + cB.get(Calendar.MONTH) + "-" + cB.get(Calendar.DATE));
        cB.set(2017, 2, -10);
        System.out.println(cB.get(Calendar.YEAR) + "-" + cB.get(Calendar.MONTH) + "-" + cB.get(Calendar.DATE));
    }
}
