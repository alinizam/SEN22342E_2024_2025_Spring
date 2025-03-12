/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example01.AfterFactory;
 
import Week03.Example01.BeforeFactroy.*;


/**
 *
 * @author ali.nizam
 */
public class Car implements IProduct{
    String model;

    public Car(String model) {
        this.model = model;
    }
    @Override
    public String getModel() {
        return model;
    }
    
}
