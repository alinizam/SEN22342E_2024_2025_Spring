/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Composite;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        ManagerComposite m=new ManagerComposite("Ahmet Ak");
        m.addComponent(new EmployeeLeaf("Mehmet Yeşil"));
        m.addComponent(new EmployeeLeaf("Kemal Sarı"));
        ManagerComposite m1=new ManagerComposite("FAtma Ak");
        m1.addComponent(new EmployeeLeaf("Hasan Sarı"));
        m.addComponent(m1);
        m.displayName();
    }
}
