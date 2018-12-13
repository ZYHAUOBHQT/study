package com.zbq.CabiAhCd_Scanner_20180723;

import java.util.Scanner;

/**
 * ScannerLineDemo
 * Create by 朱步青 on 2018/7/23
 */
public class ScannerLineDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
    }
}
