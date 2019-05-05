package com.zbq001_JavaBasics.CabiAhCd_Scanner_20180723;

import java.util.Scanner;

/**
 * ScannerDemo
 * Create by 朱步青 on 2018/7/23
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
