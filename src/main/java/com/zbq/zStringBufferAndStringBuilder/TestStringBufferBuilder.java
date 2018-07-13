package com.zbq.zStringBufferAndStringBuilder;

public class TestStringBufferBuilder {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("asdcasd");
        a.ensureCapacity(1);
        System.out.println("ensureCapacity()+capacity() : " + a.capacity());
        System.out.println("charAt() : " + a.charAt(3));
        char[] b = {'a', 'b', 's', '2'};
        a.getChars(0, 1, b, 1);
        System.out.print("getChars() : ");
        System.out.println(b);
        System.out.print("indexOf() : " + a.indexOf("a") + "\t");
        System.out.println(a.indexOf("a", 1));
        System.out.println("lastIndexOf() : " + a.lastIndexOf("a"));
        System.out.println("length() : " + a.length());
    }
}
