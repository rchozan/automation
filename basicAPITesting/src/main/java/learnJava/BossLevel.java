package learnJava;

public class BossLevel {

        public static void main(String[] args) {
            int x = 1, y = 2, z = 3;
            int result = x++ + ++y + z-- + --x + y++ + ++z - x-- - y;
             //1+1+2+3+0+2+4-3-2






            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
            System.out.println("result: " + result);
        }
    }

