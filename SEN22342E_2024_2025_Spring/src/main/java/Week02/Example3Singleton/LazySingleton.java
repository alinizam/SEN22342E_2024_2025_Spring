/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example3Singleton;

/**
 *
 * @author ali.nizam
 */
public class LazySingleton {

    static LazySingleton instance;

    private LazySingleton() {
    }

    static public LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
