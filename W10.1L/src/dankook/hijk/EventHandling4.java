package dankook.hijk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling4 {
    JButton btn;
    int count = 0;

    public static void main(String[] args) {
        EventHandling4 eh = new EventHandling4();
        eh.start();
    }

    public void start() {
        JFrame jf = new JFrame("Event Handling");
        btn = new JButton("I have been clicked " + count + " times.");
        btn.addActionListener(new EventHandling4.BtnActionListener3());

        jf.add(btn);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    class BtnActionListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //count++
            EventHandling4.this.count++;
            EventHandling4.this.btn.setText("I have been clicked " + EventHandling4.this.count + " times.");
        }
    }
}
