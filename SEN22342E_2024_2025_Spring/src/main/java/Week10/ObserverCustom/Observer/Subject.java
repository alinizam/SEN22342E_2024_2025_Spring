package Week10.ObserverCustom.Observer;

import java.util.ArrayList;

public class Subject implements ISubject {
    ArrayList<IObserver> observers = new ArrayList<>();
    String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update(state);
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
}

