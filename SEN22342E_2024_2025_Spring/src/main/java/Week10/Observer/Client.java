package Week10.Observer;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new Subject();
        subject.addObserver(new KeyPressObserver());
        subject.addObserver(new MouseButtonPressObserver());

        subject.notifyObserver();
    }
}
