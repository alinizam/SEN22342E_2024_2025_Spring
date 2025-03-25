/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Composite;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class ManagerComposite implements IComponent{
    
    ArrayList<IComponent> employees=new ArrayList<>();
    private String name;

    public ManagerComposite(String name) {
        this.name = name;
    }
    
    void addComponent(IComponent c){
        employees.add(c);
    }
  
    
    @Override
    public int getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void displayName() {
        System.out.println(name);
        for (IComponent employee : employees) {
            System.out.print(" -->");
            employee.displayName();
        }
       
    }
    
     @Override
    public void setName(String name) {
       this.name=name;
    }
    
}
