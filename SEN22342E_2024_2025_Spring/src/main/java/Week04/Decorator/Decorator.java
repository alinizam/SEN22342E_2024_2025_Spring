/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Decorator;

/**
 *
 * @author ali.nizam
 */
public abstract class Decorator implements IVehicle{
    IVehicle vehicle;

    public Decorator(IVehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}
