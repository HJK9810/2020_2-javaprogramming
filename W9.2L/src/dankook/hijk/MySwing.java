package dankook.hijk;

import javax.swing.*;
import java.awt.*;

public class MySwing extends JFrame {
    public MySwing() {
        super("연습");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane(); // factory method
        c.setBackground(Color.blue);
        c.setLayout(null);
//        c.setLayout(new FlowLayout());
//        c.setLayout(new BorderLayout(30, 20));
//        c.setLayout(new GridLayout(4, 3, 5, 5));
        for (int i = 0 ; i <= 10 ; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setBounds(i*15, i*15, 50, 20);
            c.add(b);
        }
        // FrameLayout은 아래 버튼에서 BorderLayout 제거한것과 동일
//        JButton b = new JButton("1");
//        c.add(b, BorderLayout.EAST);
//        c.add(new JButton("2"), BorderLayout.WEST);
//        c.add(new JButton("3"), BorderLayout.NORTH);
//        c.add(new JButton("4"), BorderLayout.SOUTH);
//        c.add(new JButton("5"), BorderLayout.CENTER);
        // GridLayout 용
//        for (int i = 0 ; i <= 10 ; i++) {
//            JButton b = new JButton(Integer.toString(i));
//            c.add(b);
//        }
        setVisible(true);
    }
    public static void main(String[] args) {
        MySwing s = new MySwing();
    }
}
