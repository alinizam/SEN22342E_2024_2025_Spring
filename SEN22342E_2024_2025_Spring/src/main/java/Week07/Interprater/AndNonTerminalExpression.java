/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Interprater;

/**
 *
 * @author ali.nizam
 */
public class AndNonTerminalExpression implements Expression{
    Expression e1,e2;

    public AndNonTerminalExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    
    public boolean interprate(String context) {
        return e1.interprate(context.substring(0,1))&& e1.interprate(context.substring(1));
    }
}
