/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Decorator;

/**
 *
 * @author ali.nizam
 */
public class QualityColorDecorator extends Decorator{
    String colorQuality;

    public QualityColorDecorator(IVehicle vehicle) {
        super(vehicle);
    }
    
    @Override
    public void setColor(String color) {
       vehicle.setColor(color);
       increaseColorQuality();
              
    }
    void increaseColorQuality(){
        System.out.println("Better color is setted");
    }
    
}
