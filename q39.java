import java.util.Scanner;

public class q39 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println("Before swapping: a = " + a + ", b = " + b);

    // Swapping without a third variable
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After swapping: a = " + a + ", b = " + b);
  }
}
