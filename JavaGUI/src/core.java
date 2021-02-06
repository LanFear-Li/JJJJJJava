import javax.swing.*;
import java.util.concurrent.*;
import net.mindview.util.*;

public class core {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("myFirstSwing");
        JLabel label = new JLabel("hey");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("fuck you!");
            }
        });
    }
}