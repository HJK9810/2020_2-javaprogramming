package dankook.hijk;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        StockMarketMgt2 stMgt2 = new StockMarketMgt2();
        boolean isOk = stMgt2.getDataFromFile("data.txt");

        long start = System.nanoTime();
        System.out.println(stMgt2.search("사조대림"));
        long finish = System.nanoTime();
        System.out.println("execution time for Search method is " + (finish - start));

        start = System.nanoTime();
        System.out.println(stMgt2.search2("사조대림"));
        finish = System.nanoTime();
        System.out.println("execution time for Search method is " + (finish - start));

        StockMarketMgt stMgt = new StockMarketMgt();
        boolean isOk2 = stMgt.getDataFromFile("data.txt");

        start = System.nanoTime();
        System.out.println(stMgt.search("사조대림"));
        finish = System.nanoTime();
        System.out.println("execution time for Search method is " + (finish - start));

    }
}
