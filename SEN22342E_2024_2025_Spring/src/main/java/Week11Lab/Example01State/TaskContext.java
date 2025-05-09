package Week11Lab.Example01State;

public class TaskContext {
    ITaskState state;
    public TaskContext(){
        state=new PendingState();
    }
}
