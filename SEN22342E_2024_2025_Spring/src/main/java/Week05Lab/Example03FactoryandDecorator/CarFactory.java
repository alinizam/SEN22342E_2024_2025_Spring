package Week05Lab.Example03FactoryandDecorator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author FSMVU
 */
public class CarFactory implements FactoryDecorator{

    /**
     * @param args the command line arguments
     */
    public Car createCar(String type){
        if (type.equals("Sedan")) return new SedanCar();
        else return new SportCar();
    }
    
}
