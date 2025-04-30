package Week10.ObserverCustom.Observer;

public interface ISubject {
    void notifyObserver();
    void addObserver(IObserver observer);
    String getState();
    void setState(String state);
    void removeObserver(IObserver observer);
}