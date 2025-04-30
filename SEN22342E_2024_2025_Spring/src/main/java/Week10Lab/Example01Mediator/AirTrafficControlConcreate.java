package Week10Lab.Example01Mediator;

import java.util.ArrayList;

public class AirTrafficControlConcreate implements AirTrafficControl{
    ArrayList<AirCraft> aircrafts = new ArrayList<>();

    @Override
    public void notify(AirCraft sender, String event) {
        boolean status=false;
        for (AirCraft aircraft : aircrafts) {
            if (aircraft.getLandingStatus()){
                status=true;
                break;
            }
        }
        if (!status){
            System.out.println("You can land");
            sender.setLandingStatus(true);
        }else{
            System.out.println("You should wait ");

        }
    }

    @Override
    public void registerAircraft(AirCraft aircraft) {
        aircrafts.add(aircraft);
    }
}
