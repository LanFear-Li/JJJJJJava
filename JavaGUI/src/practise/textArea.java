package practise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.swingConsole.*;

public class textArea extends JFrame {
    JButton b = new JButton("add data");
    JButton c = new JButton("clear data");
    JTextArea t = new JTextArea(20, 40);
    Map<String, String> map = new HashMap<String, String>();
    public textArea() {
        map.putAll(Countries.capitals());
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Map.Entry me : map.entrySet()) {
                    t.append(me.getKey() + ": " + me.getValue() + "\n");
                }
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });
        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
        add(c);
    }
    public static void main(String[] args) {
        run(new textArea(), 500, 500);
    }
}
