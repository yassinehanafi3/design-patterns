package org.example;

public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();


        Observer observer1 = new ObserverImpl();
        Observer observer2 = new ObserverImpl();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.updateState(20);
        observable.notifyObservers();

    }
}