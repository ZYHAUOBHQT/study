package com.zbq.CabiAhCe_SerializeDeserialize_20180724;

import lombok.Data;

import java.io.Serializable;

/**
 * User
 * Create by 朱步青 on 2018/7/24
 */
@Data
public class User implements Serializable {
    private String username;

    private String password;

    private int age;

    private String name;

    private int sex;
}
