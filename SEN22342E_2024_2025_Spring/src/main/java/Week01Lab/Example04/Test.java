/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab.Example04;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        MyArray m=new MyArray();
        m.array=new int[]{1,5,6,8,7};
        m.filterArray((i)->(i%2==0));
        System.out.println("-----");
        m.filterArray((i)->(i%5==0));
        System.out.println("------");
        m.filterArray((i)->(i>5));
    }
}
