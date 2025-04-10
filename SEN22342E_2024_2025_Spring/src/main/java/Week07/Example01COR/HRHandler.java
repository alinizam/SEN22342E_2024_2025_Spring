/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example01COR;

/**
 *
 * @author ali.nizam
 */
public class HRHandler extends LeaveHandler {

    public HRHandler(LeaveHandler handler) {
        super(handler);
    }

    @Override
    void handleRequest(Request request) {
        if (request.day > 7) {
            System.out.println("HR give the permission");    
        } else {
            super.handleRequest(request); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    }

}