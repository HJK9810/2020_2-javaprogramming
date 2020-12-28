package dankook.hijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEx extends JFrame {
    private JTextField txt1, txt2;
    private JButton btn;
    public SimpleEx() {
        super("Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt1 = new JTextField("Num1", 10);
        txt2 = new JTextField("Num2", 10);
        btn = new JButton("Add");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(txt1);
        c.add(txt2);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txt1.getText());
                int n2 = Integer.parseInt(txt2.getText());
                Integer result = n1 + n2;
                setTitle(result.toString());
            }
        });

        setVisible(true);
        txt2.setFocusable(true);
        txt2.requestFocus();
    }

    public static void main(String[] args) {
        new SimpleEx();
    }
}
