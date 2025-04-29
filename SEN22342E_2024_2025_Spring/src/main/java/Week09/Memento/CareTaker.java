package Week09.Memento;

import java.util.ArrayList;

public class CareTaker {
    ArrayList<Memento> history=new ArrayList<>();
    public void addMemento(Memento m){
        history.add(m);
    }
    public Memento getMemento(int index){
        return history.get(index);
    }
    void displayStates(){
        for(Memento m:history){
            System.out.println(m.getState());
        }
    }
}
