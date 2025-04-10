/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example01COR;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        LeaveHandler chain=new ManagerHandler(new HRHandler(null));
        chain.handleRequest(new Request(9));
        
    }
}
