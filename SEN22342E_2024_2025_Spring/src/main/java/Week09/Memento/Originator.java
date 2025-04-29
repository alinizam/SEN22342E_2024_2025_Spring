package Week09.Memento;

public class Originator {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Memento saveToMemento(){
        return new Memento(state);
    }
    public void restoreFromMemento(Memento m){
        state=m.getState();
    }


}
