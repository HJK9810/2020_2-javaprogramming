package dankook.hijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Adder extends JFrame {
    private JTextField txt;
    private JButton btn;
    private JLabel lbl;
    private int sum = 0;
    public Adder() {
        super("누적 더하기");
        setSize(250, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        txt = new JTextField("", 10);
        btn = new JButton("Add");
        lbl = new JLabel("계산결과");
        c.add(txt);
        c.add(btn);
        c.add(lbl);

        txt.addKeyListener(new MyKEyListener());
        btn.addActionListener(new MyActionListener());
        btn.addMouseListener(new MyMouseListener());
        setVisible(true);
    }
    class MyMouseListener extends MouseAdapter {
        public void MousePressed(MouseEvent e) {
            int n = Integer.parseInt(txt.getText());
            sum += n;
            lbl.setText(Integer.toString(sum));
            txt.setText("");
            txt.requestFocus();
        }
    }
    class MyKEyListener extends KeyAdapter {
        private void KeyTyped(KeyEvent e) {
            if (e.getKeyChar() < '0' || e.getKeyChar() > '9')
                e.consume();
        }
    }
    // MyMouseListener 이 사용되면 주석처리, 아니면 반대.
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
//            int n = Integer.parseInt(txt.getText());
//            sum += n;
//            lbl.setText(Integer.toString(sum));
//            txt.setText("");
//            txt.requestFocus();
        }
    }

    public static void main(String[] args) {
	    new Adder();
    }
}
