package Week10.Observer;

import java.util.ArrayList;

public class Subject implements ISubject {
    ArrayList<IObserver> observers = new ArrayList<>();


    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update();
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

