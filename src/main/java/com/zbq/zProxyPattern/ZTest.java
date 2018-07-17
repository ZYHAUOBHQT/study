package com.zbq.zProxyPattern;

public class ZTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ZImage imageProxy1 = new ZImageProxy();
        ZImage imageProxy = new ZImageProxy(imageProxy1);
        long endTime = System.currentTimeMillis();
        System.out.println("生成代理耗时：" + (endTime - startTime));
        imageProxy.load();
        long endTime2 = System.currentTimeMillis();
        System.out.println("访问耗时：" + (endTime2 - startTime));
    }
}
