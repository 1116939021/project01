package com.csr.java.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Customer {

    private int num;

    public static void main(String[] args) {
        //region Description
        System.out.println("hello world!!!");
        ArrayList<String> list1 = new ArrayList<>(); //注释，这是单行注释
        String str1 = new String();
        //endregion
        Date date = new Date();
        list1.add(0, str1);
    }

    public void moethod() {
        num = 0;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
