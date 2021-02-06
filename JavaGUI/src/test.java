import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;
import static net.mindview.util.swingConsole.*;

public class test extends JFrame {
    JButton b1 = new JButton("button 1");
    JButton b2 = new JButton("button 2");
    public test() {
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
    }
    public static void main(String[] args) {
        test xxx = new test();
        run(xxx, 500, 500);
    }
}
