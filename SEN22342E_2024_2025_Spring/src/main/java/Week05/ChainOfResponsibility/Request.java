/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
class Request {
    String context;    
    int code;

    public Request(String context, int code) {
        this.context = context;
        this.code = code;
    }
    
}
