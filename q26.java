import java.util.Scanner;

public class q26 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the side of the square: ");
    double side = scanner.nextDouble();

    double area = side * side;
    System.out.println("The area of the square is: " + area);
  }
}
