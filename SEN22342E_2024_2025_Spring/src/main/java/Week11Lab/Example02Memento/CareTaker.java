package Week11Lab.Example02Memento;

import java.util.Stack;

public class CareTaker {
    private final Stack<Memento> mementoStack = new Stack<>();
    public void addMemento(Memento memento){
        mementoStack.push(memento);
    }
    public Memento getMemento(){
        if (mementoStack.isEmpty()) return new NullMemento();
        return mementoStack.pop();
    }
}
