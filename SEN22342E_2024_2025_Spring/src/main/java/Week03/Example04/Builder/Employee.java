/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example04.Builder;

/**
 *
 * @author ali.nizam
 */
public class Employee {

    public Employee(Builder b) {
        firstName = b.firstName;
        lastName = b.lastName;
        salary = b.salary;
    }
    String firstName, lastName;
    int salary;

    static class EmpBuilder extends Builder{};

}
