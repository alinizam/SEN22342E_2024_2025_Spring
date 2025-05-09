package Week11Lab.Example01State;

public class InProgressState implements ITaskState {

    @Override
    public void claim(TaskContext task) {
        System.out.println("Already in-progress");
    }

    @Override
    public void reject(TaskContext task) {
        task.state=new PendingState();
    }

    @Override
    public void complete(TaskContext task) {
        task.state=new CompleteState();
    }

    @Override
    public void pause(TaskContext task) {
        task.state=new PendingState();
    }
}
