package com.dp.structural.decorator;

public class WhatsappDecorator extends NotifierDecorator {

    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void sendNotification(String msg) {
        super.sendNotification(msg);
        String phone = service.getPhone(getUserName());
        System.out.println("sending message "+msg+" to phone = " + phone);
    }
}
