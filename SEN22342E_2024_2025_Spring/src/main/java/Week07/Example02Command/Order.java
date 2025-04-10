/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example02Command;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Order {
    ArrayList<ICommand> menuItems=new ArrayList<>();
    ArrayList<Runnable> menuItemsRun=new ArrayList<>();

    void prepare(){
        for (ICommand menuItem : menuItems) {
            menuItem.cook();
        }
    }
    void prepareForRun(){
        for (Runnable menuItem : menuItemsRun) {
            menuItem.run();
        }
    }
}
