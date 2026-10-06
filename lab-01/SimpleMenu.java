import java.util.Scanner;
 
public class SimpleMenu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("1) Show greeting");
      System.out.println("2) Show a number squared");
      System.out.println("3) Quit");

      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Hello, Java student!");
          break;
        case 2:
          System.out.println("Enter a number:");
          int x = scanner.nextInt();
          System.out.println(x * x);
          break;
        case 3:
          System.out.println("Goodbye");
          break;
        default:
          System.out.println("Unknown option");
          break;
        }
    } while (choice != 3);

    scanner.close();
  }
}