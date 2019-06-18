package com.zbq001_JavaBasics.CabiBaCd_caiPiaoJiXuanQi_20181023;

import java.util.ArrayList;
import java.util.List;

/**
 * CaiPiaoJiXuanQi
 * Create by 朱步青 on 2018/10/23
 */
public class CaiPiaoJiXuanQi {
    public static void main(String[] args) {
        List<String> fiveNumbers = new ArrayList<>();

        System.out.println("彩票机选器：" + "\t");

        for (int i = 0; i < 5; i++) {
            List<Integer> numbers = new ArrayList<>();

            // 生成数字
            for (int j = 0; j < 7; j++) {
                if (j != 6) {
                    numbers.add(getNormalNumber(numbers));
                } else {
                    numbers.add(((int) (Math.random() * 16)) + 1);
                }
            }

            // 前六位排序
            numbers = sort(numbers);

            String[] changeNumber = numbers.toString().split(", ");

            String number = "[";

            for (int k = 0; k < changeNumber.length; k++) {
                if (k == 0) {
                    int a = Integer.parseInt(changeNumber[k].substring(1, changeNumber[k].length()));
                    if (a < 10) {
                        number += "0" + a + ", ";
                    } else {
                        number += "" + a + ", ";
                    }
                } else if (k == changeNumber.length - 1) {
                    int a = Integer.parseInt(changeNumber[k].substring(0, changeNumber[k].length() - 1));
                    if (a < 10) {
                        number += "0" + a;
                    } else {
                        number += "" + a;
                    }
                } else {
                    int a = Integer.parseInt(changeNumber[k]);
                    if (a < 10) {
                        number += "0" + a + ", ";
                    } else {
                        number += "" + a + ", ";
                    }
                }
            }

            number += "]";

            fiveNumbers.add(number);
        }

        fiveNumbers.parallelStream().forEach(numbers -> {
            System.out.println(numbers + "\t");
        });
    }

    private static List<Integer> sort(List<Integer> numberList) {
        List<Integer> numbers = new ArrayList<>();

        int lastNumber = numberList.get(numberList.size() - 1);

        numberList.remove(numberList.size() - 1);

        numbers = numberList;

        int temp = 0;
        int size = numbers.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1))  //交换两数位置
                {
                    temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        numbers.add(lastNumber);

        return numbers;
    }

    private static int getNormalNumber(List<Integer> numbers) {
        int a = ((int) (Math.random() * 33)) + 1;

        int b = 0;
        for (int j = 0; j < 10000; j++) {
            for (int i = 0; i < numbers.size(); i++) {
                if (a == numbers.get(i)) {
                    break;
                }

                b = i;
            }

            if (b == numbers.size() - 1) {
                break;
            } else {
                a = ((int) (Math.random() * 33)) + 1;
            }
        }

        return a;
    }
}
