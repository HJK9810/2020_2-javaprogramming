package dankook.hijk;

import java.util.Iterator;

class Point implements Comparable<Point>{
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point point) {
        return (x + y - (point.x + point.y));
    }
}

public class IteratorEx implements Iterator<Point>{
    private Point[] ptData;
    private int index = 0;
    private int size;

    public IteratorEx() {
        ptData = new Point[4];
        ptData[0] = new Point(1, 2);
        ptData[1] = new Point(2, 3);
        ptData[2] = new Point(3, 4);
        ptData[3] = new Point(4, 5);
        size = 4;
    }

    @Override
    public boolean hasNext() {
        if (index < size)
            return true;
        else
            return false;
    }

    @Override
    public Point next() {
        return ptData[index++];
    }

    public static void main(String[] args) {
        IteratorEx iE = new IteratorEx();
        while (iE.hasNext()) {
            System.out.println(iE.next());
        }
    }
}
