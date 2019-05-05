package com.zbq002_IO.IO_001_EncodeDemo_20190306;

/**
 * EncodeDemo
 * Create by 朱步青 on 2019/3/6
 */
public class EncodeDemo {
    public static void main(String[] args) throws Exception {
        String creaWay = "华云ABC";
        byte[] bytes1 = creaWay.getBytes(); // 转换成字节序列用的是项目默认的编码
        // 默认编码utf-8，汉字：3个字符，字母：1个字符
        for (byte b : bytes1) {
            // 把字节（转换成int）以16进制的方式显示
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
        }
        System.out.println();
        byte[] bytes2 = creaWay.getBytes("gbk");
        // 编码gbk，汉字：2个字符，字母：1个字符
        for (byte b : bytes2) {
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
        }
        System.out.println();
        byte[] bytes3 = creaWay.getBytes("utf-16be");
        // 编码utf-16be，汉字：2个字符，字母：2个字符
        for (byte b : bytes3) {
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
        }

        /*
         * 当你的字符串序列是某种编码时
         * 想把字节序列变成字符串
         * 也需要用这种编码方式
         * 否则会出现乱码
         */
        System.out.println();
        String str1 = new String(bytes3);
        System.out.println(str1);
        String str2 = new String(bytes3, "utf-16be");
        System.out.println(str2);

        /*
         * 文本文件就是字节序列
         * 可以说任意编码的字节序列
         * 如果我们在中文机器上直接创建文本文件
         * 那么该文本文件只认识ansi编码
         */
    }
}
