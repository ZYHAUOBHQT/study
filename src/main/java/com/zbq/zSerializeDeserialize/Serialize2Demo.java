package com.zbq.zSerializeDeserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize2Demo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/static/ZSerializeDeserialize/test2.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /Users/zhubuqing/Documents/githubdownload/study/src/main/resources/static/ZSerializeDeserialize/test2.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}