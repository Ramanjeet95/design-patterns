package com.dp.structural.decorator;

public class EmailNotifier implements INotifier {
    private final String userName;
    private final DbService service;

    EmailNotifier(String userName) {
        this.userName = userName;
        this.service = new DbService();
    }

    public void sendNotification(String msg) {
        String email = service.getEmail(userName);
        System.out.println("sending notification message " + msg + " to email = " + email);
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
