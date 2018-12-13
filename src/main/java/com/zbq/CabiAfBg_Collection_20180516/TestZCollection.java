package com.zbq.CabiAfBg_Collection_20180516;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

/**
 * 集合
 */
public class TestZCollection {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Collection
        Collection<Object> objColl = new ArrayList<Object>();
        objColl.add(1);
        objColl.add(2);
        objColl.add(3);
        objColl.add(4);
        Spliterator<Object> st = objColl.spliterator(); // 获得一个迭代子
        Iterator<Object> it = objColl.iterator();

        // Set
        Set<Object> set = new HashSet<Object>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set.size());
        set.toArray();
    }
}
