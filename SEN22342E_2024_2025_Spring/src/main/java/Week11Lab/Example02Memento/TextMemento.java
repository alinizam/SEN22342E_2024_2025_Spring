package Week11Lab.Example02Memento;

public class TextMemento implements Memento {
    String text;
    public TextMemento (String text) {
        this.text = text;
    }

    @Override
    public String getState() {
        return text;
    }
}
