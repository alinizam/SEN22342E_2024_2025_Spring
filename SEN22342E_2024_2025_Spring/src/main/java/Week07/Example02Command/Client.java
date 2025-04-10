/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example02Command;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        Order o=new Order();
        o.menuItems.add(new BurgerCommand(new Burger()));
        o.menuItems.add(new BurgerCommand(new Burger()));
        o.menuItems.add(new PizzaCommand(new Pizza()));
        o.prepare();
    }
}
