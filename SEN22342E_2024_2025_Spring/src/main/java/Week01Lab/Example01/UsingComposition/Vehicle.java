/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab.Example01.UsingComposition;

/**
 *
 * @author ali.nizam
 */
public class Vehicle {
    IColor colorSetter;

    public Vehicle(IColor colorSetter) {
        this.colorSetter = colorSetter;
    }
    void displayColor(){
        colorSetter.setColor();
    }
    
}
