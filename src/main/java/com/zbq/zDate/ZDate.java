package com.zbq.zDate;

import java.util.Date;

/**
 * 时间日期
 */
public class ZDate {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Date dateA = new Date(69, 1, 1);
        System.out.println(dateA.getTime());
    }
}
