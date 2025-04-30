package Week10Lab.Example02Momento;
//Originator
public class TextEditor {
    private StringBuilder text = new StringBuilder();
    public void write(String text) {
        this.text.append(text);
    }
    Memento storeState(){
         return new Memento(text.toString());
    }
    void restore(Memento memento) {
        this.text = new StringBuilder(memento.getText());
    }

}
