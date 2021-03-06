package com.zbq001_JavaBasics.CabiAhBh_Mothed_20180717;

/**
 * ZFinalizationDemo
 * Create by 朱步青 on 2018/7/17
 */
public class ZFinalizationDemo {
    public static void main(String[] args) {
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc(); // 调用Java垃圾收集器
    }
}

class Cake extends Object {
    private int id;

    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + " is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + " is disposed");
    }
}