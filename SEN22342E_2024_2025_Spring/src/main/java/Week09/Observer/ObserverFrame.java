package Week09.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObserverFrame {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(300,300);
        f.setVisible(true);
        JTextField t=new JTextField("Hello World");
        f.add(t);
        JButton b=new JButton("Click Me");
        f.add(b);
        f.setLayout(new FlowLayout());
        f.pack();
        /*b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("Hello");
            }
        });*/
        b.addActionListener( e-> {t.setText("Hello");});
    }
}
