/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public abstract class WebHandler {

    WebHandler handler;

    public WebHandler(WebHandler handler) {
        this.handler = handler;
    }

    void handleRequest(Request request) {
        if (handler!=null){
            handler.handleRequest(request);
        }
    }

}
