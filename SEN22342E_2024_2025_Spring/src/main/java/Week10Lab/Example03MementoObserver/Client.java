package Week10Lab.Example03MementoObserver;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        TextEditor editor=new TextEditor();
        HistoryManager historyManager=new HistoryManager();
        IObserver observer=new TextChangeObserver(historyManager);
        editor.addObserver(observer);
        editor.write("Hello World");
        editor.write("Merhaba");

        historyManager.undo();
        editor.write("Selam");

        historyManager.getUndoStack();
        historyManager.getRedoStack();

    }
}
