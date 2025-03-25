/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab.Example01;

/**
 *
 * @author ali.nizam
 */
public class PaymentAdaptor implements IAdaptor{
    CashPayment c;

    public PaymentAdaptor(CashPayment c) {
        this.c = c;
    }
    
    @Override
    public void sendPayment(double amount) {
       c.sendMoney(amount);
    }
    
}
