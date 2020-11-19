package dankook.hijk;

public class MyVector<T> {
    private T[] items;
    private int count;
    public MyVector() {
        items = (T[]) new Object[10];
        count = 0;
    }
    public void add(T val) {
        items[count++] = val;
    }
    public T get(int index) {
        return items[index];
    }

    public static void main(String[] args) {
        MyVector<Integer> iv = new MyVector<>();
        iv.add(1);
        iv.add(10);
        System.out.println(iv.get(1));
    }
}
