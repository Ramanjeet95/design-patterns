package com.dp.behaviour.observer;

public class Admin implements Observer {
    @Override
    public void notifyMe(Object obj) {
        System.out.println("Subject notified admin : " + obj.toString());
    }
}
