package Week10.VisitorPattern;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList <IElement> elements=new ArrayList<>();
        IVisitor visitor=(e->{
            System.out.println(e.getClass().getSimpleName());
        });
        elements.add(new Square());
        elements.add(new Square());
        elements.add(new Square());
        for (IElement element : elements) {
            element.accept(visitor);
        }

    }
}
