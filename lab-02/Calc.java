public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if(b == 0) {
            System.out.println("division by zero");
            return 0.0;
        } else {
            return (double) a / b;
        }
    }

    public static void main() {
        System.out.println(add(3, 5));

        System.out.println(multiply(4, 6));

        System.out.println(divide(7, 2));
        System.out.println(divide(7, 0));
    }
}
