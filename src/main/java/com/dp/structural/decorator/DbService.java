package com.dp.structural.decorator;

/*
* Class for representational purpose only, holds no real value in decorator pattern
* */
public class DbService {
    public String getEmail(String userName) {
        return "abc@xyz.com";
    }

    public String getPhone(String userName) {
        return "123456789";
    }

    public String getFacebook(String userName) {
        return "abc";
    }
}
