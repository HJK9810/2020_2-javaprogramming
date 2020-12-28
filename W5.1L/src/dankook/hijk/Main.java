package dankook.hijk;
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

    public static void increseInt(Integer m) {
        m = m + 1;
    }

    public static void increaseMyInt(MyInteger mInt) {
        mInt.val = mInt.val + 1;
    }
    public static void main(String[] args) {
//	    Integer n1 = Integer.valueOf(10);
//	    System.out.println(n1);
//	    increseInt(n1);
//	    System.out.println(n1);
//
//	    MyInteger t1 = new MyInteger(100);
//	    System.out.println(t1);
//	    increaseMyInt(t1);
//	    System.out.println(t1);

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int n = 0;
//        try {
//            String s = sc.nextLine();
//            n = Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            System.out.println("잘못된 숫자 형식");
//        }
        String s = sc.nextLine();
        while (!isInteger(s)) {
            System.out.println("잘못된 숫자 형식");
            s = sc.nextLine();
        }
        n = Integer.parseInt(s);
        System.out.println(n);
        // isInteger는 예외클레스 담도록 하는 클레스

    }

    private static boolean isInteger(String strNum) {
        if(strNum == null) return false;
        try {
            int v = Integer.parseInt(strNum, 10);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
