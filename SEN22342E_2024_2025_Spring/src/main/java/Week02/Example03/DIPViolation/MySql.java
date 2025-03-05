/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example03.DIPViolation;

import Week02.Example03.DIPViolationSolution.IDatabase;

/**
 *
 * @author ali.nizam
 */
public class MySql implements IDatabase{

    @Override
    public void saveOrder(String order) {
        System.out.println("MY SQL implementation");
    }
    
}
