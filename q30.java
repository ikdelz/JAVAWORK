import java.util.Scanner;

public class q30 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    if (age < 18) {
        System.out.println("Minor");
    } else if (age >= 18 && age < 35) {
        System.out.println("Youth");
    } else {
        System.out.println("Elder");
    }
}
}
