package Week09.Memento;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Originator o=new Originator();
        o.setState("S1");
        careTaker.addMemento(o.saveToMemento());
        o.setState("S2");
        o.setState("S3");
        careTaker.addMemento(o.saveToMemento());
        careTaker.displayStates();
    }
}
