/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example01.Abstractfactory;

/**
 *
 * @author ali.nizam
 */
public class BikeWithThreeTires implements IBike{
    @Override
    public String getModel() {
        return "TwoTiresBike";
    }
    
}
