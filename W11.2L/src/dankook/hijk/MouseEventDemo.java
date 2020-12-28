package dankook.hijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends JFrame {
    public MouseEventDemo() {
        setTitle("MouseEvent Demo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("test");

        Container c = getContentPane();
        c.add(btn);
        //c.addMouseListener일 경우, 클릭된 좌표가 콘솔창에 출력.
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("x = " + e.getX() + ", y = " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        setVisible(true);
        //c.addMouseListener일 경우 아래 두 열은 c.으로 변경.
        btn.setFocusable(true);
        btn.requestFocus();
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
