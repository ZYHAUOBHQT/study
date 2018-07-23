package com.zbq.zScanner;

import java.util.Scanner;

/**
 * ScannerFunDemo
 * Create by 朱步青 on 2018/7/23
 */
public class ScannerFunDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
}
