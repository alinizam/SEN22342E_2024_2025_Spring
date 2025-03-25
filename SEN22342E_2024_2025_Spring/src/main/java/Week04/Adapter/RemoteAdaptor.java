/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Adapter;

/**
 *
 * @author ali.nizam
 */
public class RemoteAdaptor implements IRemoteControlAdaptor{
    OldRemoteControl adaptee;

    public RemoteAdaptor(OldRemoteControl adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void play() {
        adaptee.playOld();
    }
    
}
