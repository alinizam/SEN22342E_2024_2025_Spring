/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.FlyWeigth;

/**
 *
 * @author ali.nizam
 */
public class Client {

    public static void main(String[] args) {
        PaymentType p = Store.getType("Cash");
        PaymentType p1 = Store.getType("Cash");
        PaymentType p2 = Store.getType("Credit Card");
        PaymentType p3 = Store.getType("Credit Card");
        PaymentType p4 = Store.getType("Credit Card");
        System.out.println(p + " : " + Store.types.size());
        System.out.println(p1 + " : " + Store.types.size());
        System.out.println(p1.getType());

    }
}
