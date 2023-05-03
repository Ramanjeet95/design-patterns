package com.dp.structural.decorator;

public abstract class NotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected final DbService service;
    public NotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        service = new DbService();
    }

    @Override
    public void sendNotification(String msg) {
        wrapped.sendNotification(msg);
    }

    public String getUserName() {
        return wrapped.getUserName();
    }
}
