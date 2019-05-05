package com.zbq001_JavaBasics.CabiAhBg_ProxyPattern_20180716;

public class ZBackground implements ZImage {
    public ZBackground() {
        super();
        try {
            Thread.sleep(2333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load() {
        System.out.println("加载图片中...");
    }
}
