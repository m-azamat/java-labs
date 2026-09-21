public class DigitCount {
  public static void main(String[] args) {
    int number = 50280;

    int digits = 0;

    if (number == 0) {
      digits = 1;
    }else {
      int rest = number;
      while (rest > 0) {
        rest = rest / 10;
        digits++;
      }
    }

    System.out.println("Digits: " + digits);
  }
}
 