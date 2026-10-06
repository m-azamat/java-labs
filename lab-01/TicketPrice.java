public class TicketPrice {
  public static void main(String[] args) {
    int age = 20;
    boolean isStudent = true;

    double basePrice = 12.0;
    double price;

    if (age < 12) {
      price = 5.0;
    } else if (age >= 65) {
      price = 7.0;
    } else if (isStudent) {
      price = 9.0;
    } else {
      price = basePrice;
    }

    System.out.println("Price: " + price);
  }
}
