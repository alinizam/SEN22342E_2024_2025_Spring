/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Facade;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        FacadeForSystem f=new FacadeForSystem();
        f.callSubsystems();
    }
}
