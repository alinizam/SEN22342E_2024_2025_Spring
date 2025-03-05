/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example2LSP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali.nizam
 */
public class Calculator {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();

        integers.add(2016);
        integers.add(2017);
        Number n=new Integer(5);
       // List<Number> numbers = integers;   // create problmes
       // numbers.add(1.2);
        System.out.println(integers);   // can print [2016, 2017, 1.68]

    }
}
