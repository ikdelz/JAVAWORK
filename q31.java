import java.util.Scanner;

public class q31 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];

    System.out.println("Enter 5 numbers:");
    for (int i = 0; i < 5; i++) {
        numbers[i] = scanner.nextInt();
    }

    System.out.println("The numbers you entered are:");
    for (int i = 0; i < 5; i++) {
        System.out.print(numbers[i] + " ");
    }
    }
}
