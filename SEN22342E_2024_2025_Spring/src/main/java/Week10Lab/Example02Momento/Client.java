package Week10Lab.Example02Momento;

public class Client {
    public static void main(String[] args) {
        TextEditor editor=new TextEditor();
        HistoryManager historyManager=new HistoryManager();
        editor.write("Hello World");
        historyManager.saveHistory(editor.storeState());
        editor.write("Merhaba");
        historyManager.saveHistory(editor.storeState());
        historyManager.undo();
        editor.write("Selam");
        historyManager.saveHistory(editor.storeState());
        historyManager.redo();
        historyManager.getUndoStack();
        historyManager.getRedoStack();

    }
}
