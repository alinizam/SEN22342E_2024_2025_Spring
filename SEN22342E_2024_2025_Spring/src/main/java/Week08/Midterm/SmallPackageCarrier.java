package Week08.Midterm;

public class SmallPackageCarrier extends Carrier {

    public SmallPackageCarrier(Carrier nextCarrier) {
        super(nextCarrier);
    }

    public void deliver(CargoComponent cargo) {

        if (cargo != null && cargo.type.equals("small")) {
            System.out.println("Deleivered by small package");
        }else {
            super.deliver();
        }

    }
}
