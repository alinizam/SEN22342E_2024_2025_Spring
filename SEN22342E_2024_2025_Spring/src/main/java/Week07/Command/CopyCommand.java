/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Command;

/**
 *
 * @author ali.nizam
 */
public class CopyCommand implements Command{
    TextEditor t;

    public CopyCommand(TextEditor t) {
        this.t = t;
    }

    @Override
    public void execute() {
        //Make something to configure command
        t.copy();        
    }
}
