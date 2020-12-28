package dankook.hijk;

import javax.swing.*;
import java.awt.*;

public class FocusDemo extends JFrame {
    private JTextField txt1, txt2;
    public FocusDemo() {
        super("Focus Demo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        txt1 = new JTextField("Num1", 10);
        txt2 = new JTextField("Num2", 10);

        c.add(txt1);
        c.add(txt2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FocusDemo();
    }
}
