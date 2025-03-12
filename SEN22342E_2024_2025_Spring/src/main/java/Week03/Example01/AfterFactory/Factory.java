/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example01.AfterFactory;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    String classType;

    IProduct getProduct(String classType) {
        
        IProduct product=null;
        if (classType.equals("Car")){
            product=new Car("Car");
        }else if (classType.equals("Bike")) {
            product=new Bike();
        }else{
            throw new IllegalArgumentException("Unsupported class type");
        }
        return product;
    }
    
}
