package com.dp.behaviour.observer;


public interface Subject {

    void notifyObservers();

    void registerObserver(Observer observer);

    void unRegisterObserver(Observer observer);
}
