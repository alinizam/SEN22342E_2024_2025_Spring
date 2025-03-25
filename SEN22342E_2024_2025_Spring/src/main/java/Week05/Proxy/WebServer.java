/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Proxy;

/**
 *
 * @author ali.nizam
 */
public class WebServer implements ServerProxy{
    @Override
    public void sendRequest(String user, String password) {
        System.out.println("The request is proccessed.");
    }
}
