package Week11.NullObject;

public class Employee extends AbstractEmployee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}