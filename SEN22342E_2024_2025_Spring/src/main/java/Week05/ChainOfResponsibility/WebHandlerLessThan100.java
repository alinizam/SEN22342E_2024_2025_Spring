/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class WebHandlerLessThan100 extends WebHandler{
    
    public WebHandlerLessThan100(WebHandler handler) {
        super(handler);
    }

    @Override
    void handleRequest(Request request) {
        System.out.println(this);
        if (request.code<100){
            System.out.println("Request handled " +request.code);
        }else{
            super.handleRequest(request); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }    
    }
    
    
}
