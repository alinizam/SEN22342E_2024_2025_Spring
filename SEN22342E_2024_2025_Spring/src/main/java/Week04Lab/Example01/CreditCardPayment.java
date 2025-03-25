/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab.Example01;

/**
 *
 * @author ali.nizam
 */
//New
public class CreditCardPayment implements IAdaptor{
    public void sendPayment(double amount) {
        System.out.println("Credit Card charged: $" + amount);
    }

}
