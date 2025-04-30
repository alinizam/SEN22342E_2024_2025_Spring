package Week10Lab.Example01Mediator;

public interface AirTrafficControl {
    void notify(AirCraft sender, String event);
    void registerAircraft(AirCraft aircraft);

}
