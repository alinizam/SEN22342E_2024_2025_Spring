/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab.Example01;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        IAdaptor adaptor=new CreditCardPayment();
        adaptor.sendPayment(1000);
        IAdaptor adaptor1=new PaymentAdaptor(new CashPayment());
        adaptor1.sendPayment(10000);
                
                
                
    }
}
