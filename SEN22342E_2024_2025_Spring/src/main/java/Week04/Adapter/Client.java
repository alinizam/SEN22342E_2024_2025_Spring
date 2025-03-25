/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Adapter;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        IRemoteControlAdaptor rca=new NewRemoteControl();
        rca.play();
        rca=new RemoteAdaptor(new OldRemoteControl());
        rca.play();
    }
    
}
