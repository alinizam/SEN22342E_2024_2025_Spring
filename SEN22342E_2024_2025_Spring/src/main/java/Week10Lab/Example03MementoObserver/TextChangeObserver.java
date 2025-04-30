package Week10Lab.Example03MementoObserver;

public class TextChangeObserver implements IObserver {
    HistoryManager historyManager;
    public TextChangeObserver(HistoryManager historyManager){
        this.historyManager = historyManager;
    }
    @Override
    public void update(TextEditor editor) {
        historyManager.saveHistory(new Memento(editor.getText().toString()));
    }

}
