package com.yuan.service.impl;


import com.yuan.service.AccountService;

import java.util.*;

public class AccountServiceImpl3 implements AccountService {

    private String[] myString;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myPros;

    public void setMyString(String[] myString) {
        this.myString = myString;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyPros(Properties myPros) {
        this.myPros = myPros;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myString));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myPros);
    }
}
