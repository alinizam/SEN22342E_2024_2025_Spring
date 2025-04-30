package Week10.ObserverCustom.Observer;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new Subject();
        subject.setState("MOUSE");
        subject.addObserver(new KeyPressObserver());
        subject.addObserver(new MouseButtonPressObserver());
        subject.addObserver(state -> {System.out.println("Anonymous class: " + state);});
        subject.notifyObserver();
    }
}
