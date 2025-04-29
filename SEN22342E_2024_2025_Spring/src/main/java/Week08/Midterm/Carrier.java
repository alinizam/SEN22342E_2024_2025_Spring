package Week08.Midterm;

public abstract class Carrier {
    Carrier nextCarrier;
    public Carrier(Carrier nextCarrier) {
        this.nextCarrier = nextCarrier;
    }
    public void deliver(){
        nextCarrier.deliver();
    }
}
