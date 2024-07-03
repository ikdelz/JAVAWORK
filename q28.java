import java.util.Scanner;

public class q28 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println("Before swapping: a = " + a + ", b = " + b);

    // Swapping
    int temp = a;
    a = b;
    b = temp;

    System.out.println("After swapping: a = " + a + ", b = " + b);
  }
}
