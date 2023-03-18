package com.dp.behaviour.observer;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;


public class Database implements Subject {

    private String operation;

    private final Set<Observer> observerList;

    private final ExecutorService executor;

    public Database(ExecutorService executor) {
        this.executor = executor;
        this.observerList = new HashSet<>();
    }

    @Override
    public void notifyObservers() {

        observerList.forEach(observer -> executor.submit(() -> observer.notifyMe(this.operation)));
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void edit(String operation) {
        this.operation = operation;
        notifyObservers();
    }

}
