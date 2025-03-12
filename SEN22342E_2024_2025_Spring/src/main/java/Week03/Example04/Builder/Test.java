/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example04.Builder;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) { 
        Employee e=new Employee.EmpBuilder().setFirstName("Ahmet").setLastName("Ak").build();
        System.out.println(e.firstName+" "+e.lastName);
    }
}
