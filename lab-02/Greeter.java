public class Greeter {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void farewell(String name) {
        System.out.println("Goodbye, " + name + "!");
    }
    public static void main(String[] args) {
        greet("Ada");
        greet("Alan");
        farewell("Ada");
    }
}
