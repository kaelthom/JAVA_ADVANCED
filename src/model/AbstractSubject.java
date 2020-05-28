package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public abstract void notifyObservers();

    public void attach(Observer observer) {
        observers.add(observer);
    }
}
