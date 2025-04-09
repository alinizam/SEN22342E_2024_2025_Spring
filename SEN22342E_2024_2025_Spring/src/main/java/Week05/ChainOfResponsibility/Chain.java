/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class Chain {
    WebHandler handler;

    public Chain(WebHandler handler) {
        this.handler =  new WebHandlerHigherThan500(
                                      new WebHandlerBetween100_500(
                                             new WebHandlerBetween100_500(
                                                     new WebHandlerLessThan100(null)
                                             )
                                      )
        );
    }
    
    void processStart(Request request) {
        handler.handleRequest(request);
    }
    
}
