import java.util.Scanner;

public class q38 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[20];
    int sum = 0;

    System.out.println("Enter 20 numbers:");
    for (int i = 0; i < 20; i++) {
      numbers[i] = scanner.nextInt();
      sum += numbers[i];
    }

    double average = sum / 20.0;

    System.out.println("Numbers less than the average (" + average + "):");
    for (int i = 0; i < 20; i++) {
      if (numbers[i] < average) {
          System.out.print(numbers[i] + " ");
      }
    }
}
}
