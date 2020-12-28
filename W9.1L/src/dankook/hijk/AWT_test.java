package dankook.hijk;

import java.awt.*;

class First extends Frame { //상속을 통해 만드는것이 일반적.
	First() {
		Button b = new Button("Click Me");
		b.setBounds(30, 100, 80, 30);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
}

public class AWT_test {

    public static void main(String[] args) {
//	    Frame f = new Frame("첫번째 AWT 예제");
//	    f.setSize(300, 500);
//
//	    Button b = new Button("Click Me!");
//	    b.setSize(100, 200);
//	    f.add(b);
//
//	    f.setVisible(true);
		First f = new First();
    }
}
