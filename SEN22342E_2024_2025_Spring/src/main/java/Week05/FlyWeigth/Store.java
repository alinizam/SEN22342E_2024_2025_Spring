/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.FlyWeigth;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ali.nizam
 */
public class Store {
    static Map<String, PaymentType> types=new HashMap<>();
    static PaymentType getType(String type){
        PaymentType peymentType;
        if ((peymentType=types.get(type))==null){
            peymentType= new PaymentType(type);
            types.put(type,peymentType);        
        }
        return peymentType;
    }        
}
