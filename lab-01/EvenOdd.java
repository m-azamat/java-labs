public class EvenOdd {
  public static void main(String[] args) {
    int n = -4;
    
    if(n % 2 == 0) {
      System.out.println("even");
    }else {
      System.out.println("odd");
    }

    if(n > 0) {
      System.out.println("positive");
    }else if(n < 0) {
      System.out.println("negative");
    }else {
      System.out.println("zero");
    }
  }
}
