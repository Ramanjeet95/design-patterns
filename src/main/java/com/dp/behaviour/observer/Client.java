package com.dp.behaviour.observer;

public class Client implements Observer {
    @Override
    public void notifyMe(Object obj) {
        System.out.println("Subject notified client : " + obj.toString());
    }
}
