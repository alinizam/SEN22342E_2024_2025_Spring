/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07.Command;

/**
 *
 * @author ali.nizam
 */
public class PasteCommand implements Command{
    TextEditor t;

    public PasteCommand(TextEditor t) {
        this.t = t;
    }

    @Override
    public void execute() {
        //Make something to configure command
        t.paste();
    }
}

