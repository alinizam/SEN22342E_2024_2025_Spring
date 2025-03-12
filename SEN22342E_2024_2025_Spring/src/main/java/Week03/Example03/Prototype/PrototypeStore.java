/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example03.Prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class PrototypeStore {
    static Map<String, IRootCourse> courses=new HashMap<>();
    static{
        courses.put("CPI2024",new ProgrammingForCurriculum(2024));
        courses.put("CPI2025",new ProgrammingForCurriculum(2025));
    } 

    public static IRootCourse getCourses(String key) {
            return (IRootCourse)((ProgrammingForCurriculum)courses.get(key)).clone();
     
    }
    
}
