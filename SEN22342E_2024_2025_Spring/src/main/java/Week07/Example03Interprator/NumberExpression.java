/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example03Interprator;

/**
 *
 * @author ali.nizam
 */
public class NumberExpression implements Expression{
   
    @Override
    public int interpret(String context) {
        return Integer.parseInt(context);
    }
    
}
