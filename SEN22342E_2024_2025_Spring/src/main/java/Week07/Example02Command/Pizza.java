/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example02Command;

/**
 *
 * @author ali.nizam
 */
public class Pizza implements MenuItem{
    public void cook(){
     System.out.println("Pizza is cooked");
    }

    @Override
    public void run() {
        System.out.println("Pizza is cooked");
    }
}
