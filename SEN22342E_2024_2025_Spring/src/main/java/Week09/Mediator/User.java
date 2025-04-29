package Week09.Mediator;

public class User extends IUser {
    User(IMediator mediator,String user) {
        super(mediator,user);
    }

    @Override
    public void sendAll(String message) {
        mediator.sendAll(message,this);
    }

    @Override
    public void send2User(String message, IUser receiver) {
        System.out.println(message + "message sended to the " + receiver.getName());
    }
}
