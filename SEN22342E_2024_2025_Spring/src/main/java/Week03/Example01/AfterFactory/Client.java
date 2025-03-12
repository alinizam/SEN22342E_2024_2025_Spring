/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example01.AfterFactory;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        Factory f=new Factory();
        IProduct p=f.getProduct("Bike lkkl");
        System.out.println(p.getModel());
    }
}
