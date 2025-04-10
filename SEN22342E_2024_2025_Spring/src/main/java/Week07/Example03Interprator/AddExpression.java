/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example03Interprator;

/**
 *
 * @author ali.nizam
 */
public class AddExpression implements Expression{
    Expression e1;
    Expression e2;

    public AddExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    
    @Override
    public int interpret(String context){
         return e1.interpret(context.substring(0,1))+e2.interpret(context.substring(2));
    }
    
}
