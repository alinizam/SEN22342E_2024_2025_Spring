package Week10.ObserverCustom.Observer;

public class MouseButtonPressObserver implements IObserver {

    @Override
    public void update(String state) {
        if (state.equals("MOUSE"))
            System.out.println("Mouse button is pressed");

    }
}
