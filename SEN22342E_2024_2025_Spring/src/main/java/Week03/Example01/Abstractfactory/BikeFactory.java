/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example01.Abstractfactory;

/**
 *
 * @author ali.nizam
 */
public class BikeFactory implements AbstractFactory{

    @Override
    public IBike getProduct(String classType) {
        IBike product=null;
        if (classType.equals("Two")){
            product=new BikeWithTwoTires();
        }else if (classType.equals("Three")) {
            product=new BikeWithThreeTires();
        }else{
            throw new IllegalArgumentException("Unsupported class type");
        }
        return product;
    }
    
}
