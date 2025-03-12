/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example03.Prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ali.nizam
 */
public class PrototypeStore {
    static Map <String,Book> books=new HashMap<>();
    static {
        ArrayList<String> author=new ArrayList<>();
        author.add("C Dickens");
        books.put("CD novel", new Book("Tales of two cities", author));
        
    }
    
    static Object getPrototype(String key){
        return books.get(key).clone();
    }

}
