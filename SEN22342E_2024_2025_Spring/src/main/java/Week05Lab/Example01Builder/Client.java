/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example01Builder;

/**
 *
 * @author FSMVU
 */
public class Client {
    public static void main(String[] args) {
        Vehicle c=new Car.CarBuilder().setairConditioning(false).sunroof(true).build();
        System.out.println(c.getAirConditioning());
    }
}
