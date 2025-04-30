package Week10.Observer;

public class KeyPressObserver implements IObserver {

    @Override
    public void update() {
        System.out.println("Key is pressed");

    }
}
