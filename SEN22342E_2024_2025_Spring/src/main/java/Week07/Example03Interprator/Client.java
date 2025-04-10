/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example03Interprator;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        String context="5+7";
        Expression e=new AddExpression(new NumberExpression(),new NumberExpression());
        System.out.println(e.interpret("5+7"));
    }
}
