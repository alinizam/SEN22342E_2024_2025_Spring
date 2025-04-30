package Week10Lab.Example01Mediator;

public abstract class AirCraft {
    protected String name;
    protected AirTrafficControl controlTower;
    private boolean landingStatus;

    public AirCraft(String name,AirTrafficControl controlTower){
        this.controlTower = controlTower;
        this.name=name;
        controlTower.registerAircraft(this);
    }
    void sendTakeOfRequest(){
        controlTower.notify(this,"TakeOff");
    }
    void sendLandingRequest(){
        controlTower.notify(this,"Landing");
    }

    void setLandingStatus(boolean landingStatus){
        this.landingStatus = landingStatus;
    }
    boolean getLandingStatus(){
        return landingStatus;
    }

}
