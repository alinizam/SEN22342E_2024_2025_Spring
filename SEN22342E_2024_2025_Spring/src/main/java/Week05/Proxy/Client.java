/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Proxy;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        ServerProxy s = new SecurityProxy(new WebServer());
        s.sendRequest("Admin", "123");
        
        ServerProxy s1 = new SecurityProxy(new SecurityProxy(new WebServer()));
        s.sendRequest("Admin", "123");
    }
}
