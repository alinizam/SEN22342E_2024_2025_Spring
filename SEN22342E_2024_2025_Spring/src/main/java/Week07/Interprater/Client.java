/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Interprater;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        Expression e1=new IsDigitTErminalExpression();
        Expression e2=new IsDigitTErminalExpression();
        
        Expression andE=new AndNonTerminalExpression(e1, e2);
        String context="1a";
        System.out.println(andE.interprate(context));
        
    }
}
