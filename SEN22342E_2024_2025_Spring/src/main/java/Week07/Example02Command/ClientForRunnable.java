/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example02Command;

/**
 *
 * @author ali.nizam
 */
public class ClientForRunnable {
    public static void main(String[] args) {
        Order o=new Order();
        MenuItem i1=new Burger();
        o.menuItemsRun.add(i1::cook);
        MenuItem i2=new Burger();
        o.menuItemsRun.add(i2::cook);
        MenuItem i3=new Pizza(); 
        o.menuItemsRun.add(i3::cook); 
        o.prepareForRun();
        
    }
}
