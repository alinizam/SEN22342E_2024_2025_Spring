/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab.Example02.SolutionUsingSingleResponsibility;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        RepairServices rs=new RepairServices();
        rs.setVehicle(new Vehicle("Togg"));
        rs.setVehicle(new Vehicle("Sedan"));
        rs.setVehicle(new Vehicle("Sedan"));
        
    }
}
