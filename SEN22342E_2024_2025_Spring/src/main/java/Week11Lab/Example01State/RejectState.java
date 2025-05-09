package Week11Lab.Example01State;

public class RejectState implements ITaskState {

    @Override
    public void claim(TaskContext task) {
        System.out.println("Not spported");
    }

    @Override
    public void reject(TaskContext task) {
        System.out.println("Not spported");
    }

    @Override
    public void complete(TaskContext task) {
        System.out.println("Not spported");
    }

    @Override
    public void pause(TaskContext task) {
        System.out.println("Not spported");
    }
}
