/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab.Example04;

/**
 *
 * @author ali.nizam
 */
public class MyArray {
    int[] array;
    void filterArray(IFilter f){
        for (int i : array) {
            if (f.apply(i)){
                System.out.println(i);
            }
        }
    }
}
