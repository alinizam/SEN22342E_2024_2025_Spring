package Week11Lab.Example02Memento;

public class NullMemento implements Memento {

    @Override
    public String getState() {
        return "Nothing in history";
    }
}
