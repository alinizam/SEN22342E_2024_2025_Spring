/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example03FactoryandDecorator;

/**
 *
 * @author FSMVU
 */
public class SportcarDecorator implements FactoryDecorator{
    FactoryDecorator f;

    public SportcarDecorator(FactoryDecorator f) {
        this.f = f;
    }

    @Override
    public Car createCar(String type) {
        System.out.println("Sport car decorated");
        return f.createCar(type);
    }
    
    
}
