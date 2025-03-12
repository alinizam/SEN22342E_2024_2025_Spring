/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example02.Abstractfactory;  

/**
 *
 * @author ali.nizam
 */
public class CarFactory implements AbstractFactory{

    @Override
    public ICar getProduct(String classType){
        ICar product=null;
        if (classType.equals("Togg")){
            product=new Togg();
        }else if (classType.equals("Honda")) {
            product=new Honda();
        }else{
            throw new IllegalArgumentException("Unsupported class type");
        }
        return product;
    }

    
   
    
}
