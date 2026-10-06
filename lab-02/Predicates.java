public class Predicates {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static boolean inRange(int value, int lo, int hi) {
        return lo <= value && value <= hi;
    }
    public static void main(String[] args) {
        System.out.println("isEven(10) = " + isEven(10));
        System.out.println("isEven(7) = " + isEven(7));
        System.out.println("inRange(5, 1, 10) = " + inRange(5, 1, 10));
        System.out.println("inRange(0, 1, 10) = " + inRange(0, 1, 10));
    }
}
