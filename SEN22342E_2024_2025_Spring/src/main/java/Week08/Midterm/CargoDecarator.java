package Week08.Midterm;

public class CargoDecarator extends CargoComponent {
    CargoComponent cargo;
    CargoDecarator(CargoComponent cargo) {
        this.cargo = cargo;
    }

    void decorateCargo(){
        System.out.println("Additional cover");
    }

    @Override
    void cover() {
        decorateCargo();
        super.cover();
    }
}
