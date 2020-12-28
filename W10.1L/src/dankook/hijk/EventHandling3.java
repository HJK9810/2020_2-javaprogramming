package dankook.hijk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling3 {
    JButton btn;
    int count = 0;

    public static void main(String[] args) {
        EventHandling3 eh = new EventHandling3();
        eh.start();
    }

    public void start() {
        JFrame jf = new JFrame("Event Handling");
        btn = new JButton("I have been clicked " + count + " times.");
        btn.addActionListener(new BtnActionListener3(this));

        jf.add(btn);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    class BtnActionListener3 implements ActionListener {
        EventHandling3 eh2;
        public BtnActionListener3(EventHandling3 o) {
            eh2 = o;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            eh2.count++;
            eh2.btn.setText("I have been clicked " + eh2.count + " times.");
        }
    }
}
