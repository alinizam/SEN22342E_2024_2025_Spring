package Week09.Mediator;

import java.util.ArrayList;

public class Mediator implements IMediator {
   ArrayList<IUser> users=new ArrayList<>();

    @Override
    public void sendAll(String message, IUser sender) {
        for (IUser user : users) {
            if (user != sender)
                sender.send2User(message,user);
        }
    }

    @Override
    public void send(String message, IUser receiver) {

    }

    @Override
    public void addUser(IUser u) {
        users.add(u);
    }
}
