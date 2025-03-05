/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example1LSP;

/**
 *
 * @author ali.nizam
 */
public class Togg extends Car{

    public void setModel(int model) {
       
        System.out.println("Tog int model");
    }

    @Override
    public void setModel(String model) throws IndexOutOfBoundsException{
        super.setModel(model); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Togg overridden method is called");
        throw new IndexOutOfBoundsException();
    }
    
}
