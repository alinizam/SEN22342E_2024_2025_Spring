/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example03FactoryandDecorator;

/**
 *
 * @author FSMVU
 */
public class Client {
    public static void main(String[] args) {
        FactoryDecorator f=new SportcarDecorator(new CarFactory());
        f.createCar("Sport");
    }
}
