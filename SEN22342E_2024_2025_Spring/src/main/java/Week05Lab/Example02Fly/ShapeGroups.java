/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example02Fly;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FSMVU
 */
class ShapeGroups implements Shape {
    List<Shape> shapes=new ArrayList<>();
    Color color;
    @Override
    public void draw() {
        
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    @Override
    public void setColor(String hue) {
        color=ColorFactory.getColor(hue);
    }
 




}
