/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example03OpenClose.After;

/**
 *
 * @author ali.nizam
 */
public class Square implements IShape{
       int a;

    public Square(int a) {
        this.a = a; 
    }

    @Override
    public int calculateArea() {
        return a*a;
    }
    
}
