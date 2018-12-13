package com.zbq.CabiAhCd_Exception_20180723;

/**
 * ExceptionFinallyDemo
 * Create by 朱步青 on 2018/7/23
 */
public class ExceptionFinallyDemo {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
