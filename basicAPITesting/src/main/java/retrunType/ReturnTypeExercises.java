package retrunType;

    public class ReturnTypeExercises {
        public static void main(String[] args) {
            ReturnTypeExercises obj = new ReturnTypeExercises();

            // Call all three methods and print results
            System.out.println("Area: " + obj.getRectangleArea(5, 3));
            System.out.println(obj.greetUser("Rajan"));
            System.out.println("Is 4 even? " + obj.isEven(4));
        }

        // Exercise 1
        public int getRectangleArea(int length, int width) {
            return length * width;
        }

        // Exercise 2
        public String greetUser(String name) {
            return "Hello, " + name + "! 👋";
        }

        // Exercise 3
        public boolean isEven(int number) {
            return number % 2 == 0;
        }

}
