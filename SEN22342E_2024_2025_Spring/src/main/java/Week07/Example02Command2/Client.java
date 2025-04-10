/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Example02Command2;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        ToolboxController t=new ToolboxController(new CopyCommand(new TextEditor()));
        t.buttonPressed();
        ToolboxController t1=new ToolboxController(new PasteCommand(new TextEditor()));
        t.buttonPressed();
    }
}
