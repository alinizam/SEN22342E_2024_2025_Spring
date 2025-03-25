/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Decorator;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        IVehicle c=new Car();
        c.setColor("Blue");
        System.out.println("--------------");
        Decorator d=new QualityColorDecorator(c);
        d.setColor("Blue");
    }
}
