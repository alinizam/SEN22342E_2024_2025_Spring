/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Decorator;

/**
 *
 * @author ali.nizam
 */
public class Car implements IVehicle{
    String color;

    @Override
    public void setColor(String color) {
        System.out.println(color);
        this.color = color;
    }
    
}
