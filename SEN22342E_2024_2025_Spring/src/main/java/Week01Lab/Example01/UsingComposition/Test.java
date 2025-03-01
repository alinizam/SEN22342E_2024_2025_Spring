/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab.Example01.UsingComposition;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Car c=new Car(new SetColorBlue());
        c.displayColor();
        Bike b=new Bike(new SetColorRed());
        b.displayColor();
        Car c1=new Car(()->{System.out.println("My color is yellow");});
        c1.displayColor();
    }
}
