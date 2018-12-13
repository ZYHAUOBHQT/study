package com.zbq.CabiAhAe_Date_20180704;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 时间日期
 */
public class ZSimpleDateFormat {
    public static void main(String[] args) {
        Date dNow = new Date();
        // 有的格式大写，有的格式小写，例如 MM 是月份，mm 是分；HH 是 24 小时制，而 hh 是 12 小时制。
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));

        System.out.println("****************************");

        // 初始化 Date 对象
        Date date = new Date();

        // c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date);
        // F的使用
        System.out.printf("年-月-日格式：%tF%n", date);
        // D的使用
        System.out.printf("月/日/年格式：%tD%n", date);
        // r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        // T的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        // R的使用
        System.out.printf("HH:MM格式（24时制）：%tR", date);

        System.out.println();
        System.out.println("****************************");

        // 初始化 Date 对象
        Date dateB = new Date();

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", dateB);

        System.out.println();
        System.out.println("****************************");

        // 初始化 Date 对象
        Date dateC = new Date();

        // 显示格式化时间
        System.out.printf("%s %tB %<te, %<tY", "Due date:", dateC);

        System.out.println();
        System.out.println("****************************");

        Date dateD = new Date();
        // b的使用，月份简称
        String str = String.format(Locale.US, "英文月份简称：%tb", dateD);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb%n", dateD);
        // B的使用，月份全称
        str = String.format(Locale.US, "英文月份全称：%tB", dateD);
        System.out.println(str);
        System.out.printf("本地月份全称：%tB%n", dateD);
        // a的使用，星期简称
        str = String.format(Locale.US, "英文星期的简称：%ta", dateD);
        System.out.println(str);
        // A的使用，星期全称
        System.out.printf("本地星期的简称：%tA%n", dateD);
        // C的使用，年前两位
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n", dateD);
        // y的使用，年后两位
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n", dateD);
        // j的使用，一年的天数
        System.out.printf("一年中的天数（即年的第几天）：%tj%n", dateD);
        // m的使用，月份
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n", dateD);
        // d的使用，日（二位，不够补零）
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n", dateD);
        // e的使用，日（一位不补零）
        System.out.printf("月份的日（前面不补0）：%te", dateD);

        System.out.println();
        System.out.println("****************************");

        SimpleDateFormat ftA = new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "2018-11-11" : args[0];

        System.out.print(input + " Parses as ");

        Date t;

        try {
            t = ftA.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ftA);
        }

        System.out.println("****************************");

        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3); // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
