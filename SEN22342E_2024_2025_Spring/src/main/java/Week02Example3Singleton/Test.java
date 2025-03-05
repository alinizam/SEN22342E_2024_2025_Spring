/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Example3Singleton;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        //EagerSingleton s=new EagerSingleton(); will not work for singleton
     
        System.out.println(EagerSingleton.instance);
        System.out.println(EagerSingleton.instance);
        
        LazySingleton l=LazySingleton.getInstance();
        LazySingleton l1=LazySingleton.getInstance();
        LazySingleton l2=LazySingleton.getInstance();
        System.out.println(l.getInstance());
        System.out.println(l1.getInstance());
        System.out.println(l2.getInstance());
    
    }
}
