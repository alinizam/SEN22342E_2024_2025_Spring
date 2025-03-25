/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Composite;

/**
 *
 * @author ali.nizam
 */
public class EmployeeLeaf implements IComponent{
    String name;

    public EmployeeLeaf(String name) {
        this.name = name;
    }
    
    @Override
    public int getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void displayName() {
        System.out.println(this.name);
    }

    @Override
    public void setName(String name) {
       this.name=name;
    }
    
    
}
