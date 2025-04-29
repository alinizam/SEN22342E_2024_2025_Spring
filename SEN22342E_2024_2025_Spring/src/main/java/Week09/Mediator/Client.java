package Week09.Mediator;

public class Client {
    public static void main(String[] args) {
        IMediator m=new Mediator();
        m.addUser(new User(m,"Ahmet"));
        m.addUser(new User(m,"Mehmet"));
        IUser u= new User(m,"Ali");
        m.addUser(u);
        u.sendAll("Merhaba");

    }
}
