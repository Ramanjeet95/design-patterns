package com.dp.structural.decorator;

public class FacebookDecorator extends NotifierDecorator{
    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void sendNotification(String msg) {
        super.sendNotification(msg);
        String fb = service.getFacebook(getUserName());
        System.out.println("sending message "+msg+" to facebook profile = " + fb);
    }
}
