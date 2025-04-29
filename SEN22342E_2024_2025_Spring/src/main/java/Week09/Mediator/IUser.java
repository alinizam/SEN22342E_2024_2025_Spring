package Week09.Mediator;

public abstract class IUser {
    IMediator mediator;
    String name;
    String getName(){
        return name;
    }
    IUser(IMediator mediator,String name){
        this.mediator=mediator;
        this.name=name;
    }
    public abstract void sendAll(String message);
    public abstract void send2User(String message,IUser receiver);

}
