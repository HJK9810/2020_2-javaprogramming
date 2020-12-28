package dankook.hijk;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Total sum is : " + sum(list1));

        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
        System.out.println("Total sum is : " + sum(list2));

        printOnlyIntegerClassorSuperClass(list1);

        List<Number> list3= Arrays.asList(4,5,6,7);
        printOnlyIntegerClassorSuperClass(list3);

        printlist(list1);
        printlist(list2);
    }

    private static double sum(List<? extends Number> list)
    {
        double sum=0.0;
        for (Number i: list)
        {
            sum+=i.doubleValue();
        }

        return sum;
    }

//    private static <T extends Number> double sum(List<T> list) {
//        double sum = 0.0;
//        for (Number i : list) {
//            sum += i.doubleValue();
//        }
//        return sum;
//    }

    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }

    private static void printlist(List<?> list)
    {

        System.out.println(list);
    }
}
