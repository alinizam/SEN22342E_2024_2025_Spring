/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab.Example03.AfterIoC;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        ICar c=new Car("Togg");
        RepaireServices rs=new RepaireServices(c);
    }
}
