package learnJava;

public class CrazyOps {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a++ + ++b;
                //+ ++b * --a - b-- + a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
