/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example03OpenClose.After;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        IShape s1=new Square(5);
        IShape s2=new Rectangle(10,5);
        IShape s3=new Rectangle(5,5);
        IShape[] shapes={s1,s2,s3};
        for (IShape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
        
    }
        
}
