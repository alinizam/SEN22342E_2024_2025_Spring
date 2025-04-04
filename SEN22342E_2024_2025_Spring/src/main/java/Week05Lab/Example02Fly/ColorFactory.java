/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example02Fly;

import java.util.HashMap;
import java.util.Map; 

/**
 *
 * @author FSMVU
 */
public class ColorFactory {
    static Map<String,Color> colors=new HashMap<>();
    static Color getColor(String hue){
        return colors.computeIfAbsent(hue, Color::new);
    }
}
