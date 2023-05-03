package com.dp.structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(new WhatsappDecorator(new EmailNotifier("Raman")));
        notifier.sendNotification("Hello");
    }
}
