package Week11Lab.Example01State;

public class PendingState implements ITaskState {

    @Override
    public void claim(TaskContext task) {
        task.state=new InProgressState();
    }

    @Override
    public void reject(TaskContext task) {
        task.state=new RejectState();
    }

    @Override
    public void complete(TaskContext task) {
        System.out.println("Not supported");
    }

    @Override
    public void pause(TaskContext task) {
        System.out.println("Not supported");
    }
}
