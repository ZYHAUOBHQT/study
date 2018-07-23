package com.zbq.zReflect;

import java.lang.reflect.Field;

/**
 * TestPoJo
 * Create by 朱步青 on 2018/7/18
 */
public class TestPoJo {
    private int a;

    private int b;

    private String c;

    public TestPoJo() {
    }

    public TestPoJo(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public static void main(String[] args) {
        TestPoJo obj = new TestPoJo();
        try {
            Field[] fields = obj.getClass().getDeclaredFields();
            for (int j = 0; j < fields.length; j++) {
                fields[j].setAccessible(true);
                // 字段名
                System.out.print(fields[j].getName() + ",");
                if (fields[j].getType().equals(int.class)) {
                    fields[j].set(obj, 1);
                } else if (fields[j].getType().equals(String.class)) {
                    fields[j].set(obj, "1");
                }
                Object _Object = fields[j].get(obj);
                System.out.println(_Object);
            }
        } catch (Exception e) {
        }
    }
}
