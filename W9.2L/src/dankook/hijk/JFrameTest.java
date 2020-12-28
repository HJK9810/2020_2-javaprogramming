package dankook.hijk;

import javax.swing.*;
import java.util.Scanner;

public class JFrameTest extends JFrame {
    public JFrameTest() {
        super("Testing");
        setSize(700, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrameTest jft = new JFrameTest();
        Scanner sc = new Scanner(System.in);
        System.out.print("Try any key:");
        String abc;
        abc = sc.nextLine();

        System.out.println(" 다시 JFrame 보이기");
        jft.setVisible(true);
    }
}
