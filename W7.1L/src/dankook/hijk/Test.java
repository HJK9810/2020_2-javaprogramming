package dankook.hijk;

public class Test<T> {

    T obj;
    Test(T obj) { this.obj = obj; }
    public T getObject() { return this.obj; }

    public static void main(String[] args) {
	    Test <Integer> iobj = new Test<Integer>(15);
	    System.out.println(iobj.getObject());
    }
}
