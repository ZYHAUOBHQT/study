package com.zbq.zArray;

import java.util.Arrays;

public class ZArrays {
    public static void main(String[] args) {
        char[] a = new char[10];
        Arrays.fill(a, 0, 5, 'd');
        // 打印所有数组元素
        for (double b : a) {
            System.out.println(b);
        }

        System.out.println("************************************************");

        Arrays.sort(a);
        for (double b : a) {
            System.out.println(b);
        }

        System.out.println("************************************************");

        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);

        System.out.println("************************************************");

        double[] myUseList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < myUseList.length; i++) {
            System.out.println(myUseList[i] + " ");
        }
        // 计算所有元素的总和
        double myTotal = 0;
        for (int i = 0; i < myUseList.length; i++) {
            myTotal += myUseList[i];
        }
        System.out.println("Total is " + myTotal);
        // 查找最大元素
        double max = myUseList[0];
        for (int i = 1; i < myUseList.length; i++) {
            if (myUseList[i] > max)
                max = myUseList[i];
        }
        System.out.println("Max is " + max);

        double[] myListA = {1.9, 2.9, 3.4, 3.5};

        System.out.println("************************************************");

        // 打印所有数组元素
        for (double element : myListA) {
            System.out.println(element);
        }

        System.out.println("************************************************");

        String s[][] = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
    }
}
