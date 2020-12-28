package dankook.hijk;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList();
        iList.add(7);
        iList.add(3);
        iList.add(10);
        System.out.println("iList의 크기 = " + iList.size());
        for (var v:iList) {
            System.out.println(v);
        }
        Collections.sort(iList);
        for (var v:iList) {
            System.out.println(v);
        }
        ArrayList<Point> pList = new ArrayList<>();
        pList.add(new Point(1,3));
        pList.add(new Point(3, 1));
        pList.add(new Point(-1, 0));

        for (var v:pList) {
            System.out.println(v);
        }

        Iterator<Point> itL = pList.iterator();
        while (itL.hasNext()) {
            Point p = itL.next();
            System.out.println(p);
        }
    }
}
