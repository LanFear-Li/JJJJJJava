package practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.swingConsole.*;

public class button extends JFrame {
    JButton b1 = new JButton("button 1");
    JButton b2 = new JButton("button 2");
    JTextField text = new JTextField(10);
    ActionListener bl = new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            String name = ((JButton)event.getSource()).getText();
            text.setText(name);
        }
    };
    public button() {
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(text);
    }
    public static void main(String[] args) {
        run(new button(), 500, 500);
    }
}
