package Week09.Mediator;

public interface IMediator {
    void sendAll(String message, IUser sender);
    void send(String message, IUser receiver);
    void addUser(IUser u);

}
