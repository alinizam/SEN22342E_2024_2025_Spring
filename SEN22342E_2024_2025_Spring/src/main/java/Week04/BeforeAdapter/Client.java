/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.BeforeAdapter;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        OldRemoteControl o=new OldRemoteControl();
        o.playOld();
        NewRemoteControl n=new NewRemoteControl();
        n.play();
    }
}
