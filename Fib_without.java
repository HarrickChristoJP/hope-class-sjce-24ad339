import java.awt.*;
import javax.swing.*;

public class Fib_without {
    public static void main(String[] args) {
        JFrame f = new JFrame("GUI Example");
        JTextField t1 = new JTextField(10), t2 = new JTextField(10);
        JButton btn = new JButton("Display");
        
        f.setLayout(new FlowLayout());
        f.add(t1); f.add(t2); f.add(btn);
        f.setSize(400,150); f.setDefaultCloseOperation(3); f.setVisible(true);
        
        btn.addActionListener(e -> {
            JFrame msg = new JFrame("Output");
            msg.add(new JLabel(t1.getText() + " " + t2.getText()));
            msg.setSize(300,100); msg.setVisible(true);
        });
    }
}