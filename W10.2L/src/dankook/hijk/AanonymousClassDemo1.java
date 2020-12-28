package dankook.hijk;

class Pollygon {
    public void display() {
        System.out.println("Inside the Polygon class.");
    }
}

public class AanonymousClassDemo1 {
    public void createClass() {
        Pollygon m1 = new Pollygon() {
            @Override
            public void display() {
                System.out.println("Inside the MyPolygon class.");
            }
        };
        m1.display();
    }
    public static void main(String[] args) {
        AanonymousClassDemo1 an = new AanonymousClassDemo1();
        an.createClass();
    }
}
