package com.yuan.service.impl;


import com.yuan.service.AccountService;

import java.util.Date;

public class AccountServiceImpl implements AccountService {
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("账号保存了"+name+age+birthday);
    }
}
