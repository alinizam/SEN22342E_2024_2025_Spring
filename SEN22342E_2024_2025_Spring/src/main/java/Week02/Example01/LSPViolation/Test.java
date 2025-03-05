/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example01.LSPViolation;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setSpeed(100);
        System.out.println("Car speed: " + car.getSpeed()); 

        Vehicle bicycle = new Bicycle();
        bicycle.setSpeed(100);  
    }
}


