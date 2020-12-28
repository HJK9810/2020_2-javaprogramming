package dankook.hijk;

import java.util.ArrayList;
import java.util.List;

class A {
    public int getValue() {
        return 0;
    }
}
class B extends A {}
class C extends B {}

public class WildCardDeomo2 {
    public static void main(String[] args) {

        A a = new B();
        A a2 = new C();

        //이들에 대한 List인 경우?
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
//        listB = listA; listA에는 C instance도 존재할수, assignment 불가능
//        listA = listB; listA는 실제로는 listB의 객체를 참조.

        processElements(listA);
//        processElements(listB);
        List<?> listUknown = new ArrayList<>();
        List<? extends A> listUknown2 = new ArrayList<>();
        List<? super A> listUknown3 = new ArrayList<>();

//        listUknown.add(new Object());

        processElements2(listA);
        processElements2(listB); // 이 경우 가능 이유는 Object의 기능들을 사용하고 있음
        processElements3(listB); // A의 기능을 사용하도록 Upper Bounded wildcard사용

        insertElements(listA);
        List<Object>listObject = new ArrayList<>();
        insertElements(listObject);
    }
    public static void processElements(List<A> elements) {
        for(A o : elements) {
            System.out.println(o.getValue());
        }
    }
    public static void processElements2(List<?> elements) {
        for (Object o : elements) {
            System.out.println(o);
        }
    }
    public static void processElements3(List<? extends A> elements) {
        for (A a : elements) {
            System.out.println(a.getValue());
        }
    }
    public static void insertElements(List<? super A> list) {
        list.add((new A()));
        list.add((new B()));
        list.add((new C()));
    }
}
