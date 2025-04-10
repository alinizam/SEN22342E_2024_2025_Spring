/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example01COR;

/**
 *
 * @author ali.nizam
 */
public abstract class LeaveHandler {

    LeaveHandler nextHandler;

    public LeaveHandler(LeaveHandler handler) {
        this.nextHandler = handler;
    }

    void handleRequest(Request request) {
        if (nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }

}
