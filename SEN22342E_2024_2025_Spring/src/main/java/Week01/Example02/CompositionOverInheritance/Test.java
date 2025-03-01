/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example02.CompositionOverInheritance;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Calculator c=new Calculator(2, 1);
        class sum implements IOperation{

            @Override
            public int operate(int a, int b) {
                return a+b;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        }
        System.out.println(c.calculate(new sum()));
        
        IOperation sum2=new IOperation(){

            @Override
            public int operate(int a, int b) {
                return a+b;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        };
        System.out.println(c.calculate(new sum()));
        
        
        
        IOperation sum1=(a,b)->a+b;
        System.out.println(c.calculate(sum1));
        IOperation minus=(a,b)->{return a-b;};
        System.out.println(c.calculate(minus));
        
        
               
    }
    
 
}
