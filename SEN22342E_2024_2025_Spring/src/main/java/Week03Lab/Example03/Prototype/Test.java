/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example03.Prototype;

/**
 *
 * @author ali.nizam
 */
public class Test {

    public static void main(String[] args) {
        Book b = (Book) PrototypeStore.getPrototype("CD novel");
        b.getAuthors().add("A");
        System.out.println(b.getAuthors());
        Book b1 = (Book) PrototypeStore.getPrototype("CD novel");
        System.out.println(b1.getAuthors());
    }
}
