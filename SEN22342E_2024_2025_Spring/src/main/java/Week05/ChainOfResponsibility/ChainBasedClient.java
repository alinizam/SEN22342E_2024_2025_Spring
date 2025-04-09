/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class ChainBasedClient {
    public static void main(String[] args) {
        Chain c=new Chain(new WebHandlerLessThan100(null));
         c.processStart(new Request("context", 10000));
    }
            
}
