package dankook.hijk;

public class NestClass {
    public int num = 1;
    public NestClass() {
        new InnerClass();
    }
    class InnerClass {
        int num2 = 2;
        InnerClass() {
            System.out.println(num);
            System.out.println(num2);
        }
    }

    public static void main(String[] args) {
        new NestClass();
    }
}
