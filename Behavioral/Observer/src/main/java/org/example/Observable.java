package org.example;


public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void updateState(int state);
    void notifyObservers();
}
