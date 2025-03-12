/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example04.Builder;

/**
 *
 * @author ali.nizam
 */
public class Builder {
    String firstName,lastName;
    int salary;

    public Employee build(){
        return new Employee(this);
    }
    
    public Builder setSalary(int salary) {
        this.salary=salary;
        return this;
    }
    public Builder setFirstName(String firstName) {
        this.firstName=firstName;
        return this;
    }
    
    public Builder setLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }
    
}
