package dankook.hijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventTest extends JFrame {
    public KeyEventTest() {
        super("KeyEvent");

        Container c = getContentPane();
        c.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("KeyTyped");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("KeyPressed");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("KeyReleased");
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
                System.out.println(KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new KeyEventTest();
    }
}
