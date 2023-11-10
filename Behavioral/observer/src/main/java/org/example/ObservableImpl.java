package org.example;


import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

    private int state = 0;
    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void subscribe(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void updateState(int state) {
        this.state = state;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.state);
        }
    }
}
