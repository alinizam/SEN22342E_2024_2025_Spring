package Week11Lab.Example02Memento;

public class TextEditor {
    StringBuilder text=new StringBuilder();
    public void write(String text){
        this.text.append(text);
    }
    public Memento saveState(){
        return new TextMemento(text.toString());
    }
    public void restoreState(Memento memento){
        text=new StringBuilder(memento.getState());
    }
    public String getText(){
        return text.toString();
    }

}
