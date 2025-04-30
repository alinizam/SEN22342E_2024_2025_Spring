package Week10.ObserverCustom.Observer;

public class KeyPressObserver implements IObserver {

    @Override
    public void update(String state) {
        if (state.equals("KEY"))
            System.out.println("Key is pressed");

    }
}
