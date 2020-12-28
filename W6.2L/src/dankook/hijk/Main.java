package dankook.hijk;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Student s = new Student("임영웅", "lim@dankook.ac.kr");
        List<Student> sList = new ArrayList<>();
        sList.add(s);
        Student s2 = new Student("장민호", "chang@gmail.com");
        sList.add(s2);
        Collections.sort(sList);
        Student s3 = Utils.genericMax(s, s2);

	    Utils.displayElement(1);
	    List l = new LinkedList<>();
	    l.add(1);
    }
}
