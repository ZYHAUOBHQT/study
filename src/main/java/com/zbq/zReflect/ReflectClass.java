package com.zbq.zReflect;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * ReflectClass
 * Create by 朱步青 on 2018/7/18
 */
public class ReflectClass {
    private ReflectClass() {
    }

    /**
     * obj反射的对象,获取对象的字段名和值
     *
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static HashMap<String, Object> reflect(Object obj) throws IllegalAccessException, IllegalArgumentException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        if (obj == null)
            return null;
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int j = 0; j < fields.length; j++) {
            fields[j].setAccessible(true);
            // 字段名
            System.out.print(fields[j].getName() + ",");
            Object _Object = fields[j].get(obj);
            map.put(fields[j].getName(), _Object);
            System.out.println();
        }
        return map;
    }
}
