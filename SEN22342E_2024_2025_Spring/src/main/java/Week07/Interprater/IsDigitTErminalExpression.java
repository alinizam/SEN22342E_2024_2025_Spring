/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Interprater;

/**
 *
 * @author ali.nizam
 */
public class IsDigitTErminalExpression implements Expression{

    @Override
    public boolean interprate(String context) {
        return Character.isDigit(context.charAt(0));
    }
    
    
    
}
