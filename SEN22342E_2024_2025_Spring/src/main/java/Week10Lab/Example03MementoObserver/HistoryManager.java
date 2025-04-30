package Week10Lab.Example03MementoObserver;

import java.util.Stack;

public class HistoryManager {
    private final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();
    void saveHistory(Memento memento){
        undoStack.push(memento);
        redoStack.clear();
    }
    void undo(){
        if(!undoStack.isEmpty()){
            redoStack.push(undoStack.pop());
        }
    }
    void redo(){
        if(!redoStack.isEmpty()){
            undoStack.push(redoStack.pop());
        }
    }

    public Stack<Memento> getRedoStack() {
        return redoStack;
    }

    public Stack<Memento> getUndoStack() {
        return undoStack;
    }
}
