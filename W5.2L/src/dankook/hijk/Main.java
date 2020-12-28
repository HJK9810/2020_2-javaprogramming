package dankook.hijk;
import java.awt.*;
import java.util.*;

class MyInteger{
    public int val;
    public MyInteger(int v) {
        val =v;
    }
    public String toString() {
        return "MyInteger{" + "val=" + val + "}";
    }
}

public class Main {
    private static boolean isInteger(String strNum) {
        if(strNum == null) return false;
        try {
            int v = Integer.parseInt(strNum, 10);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Vector<Integer> vecInt = new Vector<>();
        System.out.println(vecInt.capacity());
        for (int i = 0 ; i < 50 ; i++) {
            vecInt.add(i);
            System.out.println("i = " + i + ", " + vecInt.capacity());
        }
        System.out.println(vecInt.contains(25));
        System.out.println(vecInt.indexOf(25));
        vecInt.add(25, -1);
        System.out.println(vecInt.indexOf(25));

        Vector<Integer> cloneObj =(Vector<Integer>) vecInt.clone();
        System.out.println(vecInt.equals(cloneObj));

        cloneObj.remove(25);
        System.out.println(vecInt.equals(cloneObj));

        Collections.reverse(cloneObj);
        for (var e:cloneObj) {
            System.out.println(e);
        }

        Vector<Point> vecPt = new Vector<>();
        vecPt.add(new Point(0, 1));
        vecPt.add(new Point(-1, 1));
        vecPt.add(new Point(10, -1));

        printVector(cloneObj);
//        for (var p:vecPt) {
//            System.out.println(p);
//        }
    }

    private static void printVector(Vector<Integer> v) {
        for(int i = 0; i<v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }
    }
}

