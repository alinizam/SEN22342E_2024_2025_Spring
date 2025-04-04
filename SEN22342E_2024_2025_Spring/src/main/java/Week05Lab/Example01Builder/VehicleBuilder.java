/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example01Builder;

/**
 *
 * @author FSMVU
 */
public interface VehicleBuilder {
    VehicleBuilder setairConditioning(boolean type);
    VehicleBuilder sunroof(boolean type);
    VehicleBuilder GPS(boolean type);
    Vehicle build();

}
