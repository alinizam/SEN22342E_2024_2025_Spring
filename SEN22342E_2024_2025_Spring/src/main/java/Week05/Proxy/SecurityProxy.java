/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Proxy;

/**
 *
 * @author ali.nizam
 */
public class SecurityProxy implements ServerProxy{
    ServerProxy webServer;

    public SecurityProxy(ServerProxy webServer) {
        this.webServer = webServer;
        System.out.println("Security test is finished.");
    }
    
    @Override
    public void sendRequest(String user, String password) {
        if (user.equals("Admin") && password.equals("123")){
            webServer.sendRequest(user, password);
        }else{
            System.out.println("Password is incorrect");
        }
        
    }
    
}
