package Week11Lab.Example01State;

public class Client {
    public static void main(String[] args) {
        TaskContext taskContext=new TaskContext();
        taskContext.state.claim(taskContext);
        System.out.println(taskContext.state);
        taskContext.state.pause(taskContext);
        System.out.println(taskContext.state);
        taskContext.state.pause(taskContext);
        System.out.println(taskContext.state);
        taskContext.state.complete(taskContext);
        System.out.println(taskContext.state);
        taskContext.state.claim(taskContext);
        System.out.println(taskContext.state);
        taskContext.state.complete(taskContext);
        System.out.println(taskContext.state);
    }
}
