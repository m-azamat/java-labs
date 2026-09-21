
public class UnitConverter {
  public static void main(String[] args) {
    double celsius = 22.0;
    double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

    System.out.println("celsius: " + celsius);
    System.out.println("fahrenheit: " + fahrenheit);
    System.out.println("fahrenheit(int): " + (int)fahrenheit);
  }
}
