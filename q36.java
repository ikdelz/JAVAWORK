import java.util.Scanner;

public class q36 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[4][7];
    int total = 0;

    System.out.print("Enter 28 elements for a 4x7 array:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 7; j++) {
          array[i][j] = scanner.nextInt();
          total += array[i][j];
      }
    }

    System.out.println("Total of the entered elements: " + total);
    }
}
