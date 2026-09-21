public class TimesRow {
  public static void main(String[] args) {
    int factor = 7;

    for (int i = 1; i <= 10; i++) {
      if (i > 1) {
          System.out.print(" ");
      }
      System.out.print(factor * i);
    }
    System.out.println();

    int j = 1;
    while (j <= 10) {
      if (j > 1) {
          System.out.print(" ");
      }
      System.out.print(factor * j);
      j++;
    }
    System.out.println();
  }
}