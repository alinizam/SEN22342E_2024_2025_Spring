/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Command;

/**
 *
 * @author ali.nizam
 */
public class RunnableController {
    Runnable method;

    public RunnableController(Runnable method) {
        this.method = method;
    }
    void issueCommand(){
        method.run();
    }
}
