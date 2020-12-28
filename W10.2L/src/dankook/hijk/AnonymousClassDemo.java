package dankook.hijk;

import java.awt.*;

class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class.");
    }
}
class MyPoloygon extends Polygon {
    @Override
    public void display() {
        System.out.println("Inside the MyPolygon class.");
    }
}

public class AnonymousClassDemo {
    public void createClass() {
        Polygon p1 = new Polygon();
        p1.display();
        MyPoloygon p2 = new MyPoloygon();
        p2.display();
    }
    public static void main(String[] args) {
	    AnonymousClassDemo an = new AnonymousClassDemo();
	    an.createClass();
    }
}
