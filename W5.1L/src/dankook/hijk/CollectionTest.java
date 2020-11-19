package dankook.hijk;

import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Object> aL = new ArrayList<>();
        aL.add(1);
        aL.add("test");
        int n = (int) aL.get(0);
        String s = (String) aL.get(1);
        System.out.println(n + s);
//        n = (int) aL.get(1);

        ArrayList<Integer> iL = new ArrayList<>();
        iL.add(1);
        iL.add(2);
        for (var i: iL) {
            System.out.println(i);
        }

        ArrayList<String> sL = new ArrayList<>();
        sL.add("test");
        sL.add("arrayList");
        for (var t: sL) {
            System.out.println(t);
        }
    }
}
