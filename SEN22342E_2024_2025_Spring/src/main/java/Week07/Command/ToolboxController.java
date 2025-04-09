/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Command;

/**
 *
 * @author ali.nizam
 */
public class ToolboxController {
    Command command;

    public ToolboxController(Command command) {
        this.command = command;
    }
    void buttonPressed(){
        command.execute();
    }
}
