package Week10.Observer;

public interface ISubject {
    void notifyObserver();
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
}