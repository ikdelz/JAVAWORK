import java.util.*;

public class q23 {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    float m;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the marks: ");
    m = scanner.nextFloat();

    int ch = (int) (m / 10);

    switch (ch) {
      case 10:
      case 9:
      case 8:
        System.out.println("Grade A");
        break;
      case 7:
        System.out.println("Grade B");
        break;
      case 6:
        System.out.println("Grade C");
        break;
      case 5:
        System.out.println("Grade D");
        break;
      case 4:
      case 3:
      case 2:
      case 1:
      case 0:
        System.out.println("Grade F");
        break;
      default:
        System.out.println("Invalid Input");
        break;
    }
  }
}
