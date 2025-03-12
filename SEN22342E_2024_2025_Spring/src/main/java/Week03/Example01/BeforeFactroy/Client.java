/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example01.BeforeFactroy;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        IProduct car=new Car("Car");
        System.out.println(car.getModel());
        IProduct bike=new Bike();
        System.out.println(bike.getModel());
        
    }
}
