package com.zbq.zSerializeDeserialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * DeserializeDemo
 * Create by 朱步青 on 2018/7/24
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/static/ZSerializeDeserialize/test.txt"));
            User user = (User) ois.readObject();
            System.out.println(user.toString());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
