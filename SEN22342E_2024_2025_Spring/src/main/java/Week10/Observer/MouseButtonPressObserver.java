package Week10.Observer;

public class MouseButtonPressObserver implements IObserver {

    @Override
    public void update() {
        System.out.println("Mouse button is pressed");

    }
}
