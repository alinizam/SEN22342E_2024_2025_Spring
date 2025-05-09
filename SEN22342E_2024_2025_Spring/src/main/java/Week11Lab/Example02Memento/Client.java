package Week11Lab.Example02Memento;


public class Client {
    public static void main(String[] args) {
        TextEditor editor=new TextEditor();
        editor.write("Hello World");
        CareTaker history=new CareTaker();
        history.addMemento(editor.saveState());
        editor.write("Hello Again");
        history.addMemento(editor.saveState());

        Memento m=history.getMemento();
        System.out.println(m.getState());
        m=history.getMemento();
        System.out.println(m.getState());
        m=history.getMemento();
        System.out.println(m.getState());

    }
}
