package dankook.hijk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling2 {
    JButton btn;
    int count = 0;

    public static void main(String[] args) {
        EventHandling2 eh = new EventHandling2();
        eh.start();
    }

    public void start() {
        JFrame jf = new JFrame("Event Handling");
        btn = new JButton("I have been clicked " + count + " times.");
        btn.addActionListener(new BtnActionListener2(this));

        jf.add(btn);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}

class BtnActionListener2 implements ActionListener {
    EventHandling2 eh2;
    public BtnActionListener2(EventHandling2 o) {
        eh2 = o;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        eh2.count++;
        eh2.btn.setText("I have been clicked " + eh2.count + " times.");
    }
}