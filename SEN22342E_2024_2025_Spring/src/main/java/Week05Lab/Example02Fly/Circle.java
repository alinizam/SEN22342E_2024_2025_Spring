/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example02Fly;

/**
 *
 * @author FSMVU
 */
public class Circle implements Shape{
 
    Color color;
    @Override
    public void draw() {
        System.out.println("Drive circle");      
    }

    @Override
    public void setColor(String hue) {
        color=ColorFactory.getColor(hue);
    }
}
