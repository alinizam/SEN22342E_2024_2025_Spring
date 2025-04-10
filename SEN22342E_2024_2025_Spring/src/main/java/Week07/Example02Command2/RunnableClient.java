/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example02Command2;

/**
 *
 * @author ali.nizam
 */
public class RunnableClient {
    public static void main(String[] args) {
       TextEditor t=new TextEditor();
        RunnableController r=new RunnableController(t::copy);
        r.issueCommand(); 
        RunnableController r1=new RunnableController(t::paste);
        r.issueCommand();
       
    }
}
