package Week10Lab.Example03MementoObserver;

import java.util.ArrayList;

//Originator
public class TextEditor {
    ArrayList<IObserver> observers=new ArrayList<>();
    private StringBuilder text = new StringBuilder();
    public void write(String text) {
        this.text.append(text);
        notifyObservers();
    }

    public StringBuilder getText() {
        return text;
    }
    void addObserver(IObserver observer){
        observers.add(observer);
    }

    void restore(Memento memento) {
        this.text = new StringBuilder(memento.getText());
    }
    void notifyObservers(){
        for(IObserver observer:observers){
            observer.update(this);
        }

    }
}
