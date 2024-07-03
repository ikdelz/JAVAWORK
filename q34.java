import java.util.Scanner;

public class q34 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];

    System.out.print("Enter 10 numbers:");
    for (int i = 0; i < 10; i++) {
        numbers[i] = scanner.nextInt();
    }

    System.out.println("Even numbers:");
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
            System.out.print(numbers[i] + " ");
        }
    }

    System.out.println("\nOdd numbers:");
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 != 0) {
            System.out.print(numbers[i] + " ");
        }
    }
  }
}
