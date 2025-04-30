package Week10Lab.Example01Mediator;

public class Client {
    public static void main(String[] args) {
        AirTrafficControl tower=new AirTrafficControlConcreate();
        AirCraft aircraft1=new AirCraftConcreate("AirCraft 1",tower);
        AirCraft aircraft2=new AirCraftConcreate("AirCraft 2",tower);
        aircraft1.sendLandingRequest();
        aircraft2.sendLandingRequest();


    }
}
