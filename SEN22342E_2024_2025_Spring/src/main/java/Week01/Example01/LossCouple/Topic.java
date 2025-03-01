/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example01.LossCouple;

/**
 *
 * @author ali.nizam
 */
public class Topic implements ITopic{
    
        String definition;
        int i;
        int j;
        public void understand() {
            System.out.println("Tight coupling concept "+definition);
        }
    
}
