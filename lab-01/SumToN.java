public class SumToN {
  public static void main(String[] args) {
    int n = 100;

    if (n <= 0) {
      System.out.println("n must be positive");
    }else {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
          sum += i;
      }
      System.out.println("Sum: " + sum);
      System.out.println("Formula: " + n * (n + 1) / 2);
    }
  }
}
 