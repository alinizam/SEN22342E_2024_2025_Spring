/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.Facade;

/**
 *
 * @author ali.nizam
 */
public class FacadeForSystem {
    void callSubsystems(){
        SubSystem1 s1=new SubSystem1();
        SubSystem2 s2=new SubSystem2();
        s1.doSS1();
        s2.doSS2();
        
    }
}
