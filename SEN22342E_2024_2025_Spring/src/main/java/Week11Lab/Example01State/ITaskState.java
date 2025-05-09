package Week11Lab.Example01State;

public interface ITaskState {
    void claim(TaskContext task);
    void reject(TaskContext task);
    void complete(TaskContext task);
    void pause(TaskContext task);
}
