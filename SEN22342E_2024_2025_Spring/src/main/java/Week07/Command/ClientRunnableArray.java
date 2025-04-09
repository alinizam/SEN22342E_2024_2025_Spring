/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Command;

/**
 *
 * @author ali.nizam
 */
public class ClientRunnableArray {
    public static void main(String[] args) {
        TextEditor t=new TextEditor();
        Runnable commands[]={t::copy,t::paste,t::copy};
        for (Runnable command : commands) {
            command.run();
        }
    }
}
