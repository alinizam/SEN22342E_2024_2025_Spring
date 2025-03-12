/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example04.FactoryWithProtoype;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ali.nizam
 */
public class PrototypeStore {
    static Map <String,DatabaseConnection> connections=new HashMap<>();
    static {
       
        connections.put("MYSQL", new MySQLConnection());
        
    }
    
    static Object getPrototype(String key){
        return connections.get(key).clone();
    }

}
