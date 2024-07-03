import java.util.Scanner;

public class q27 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    double[] scores = new double[5];
    double total = 0, allowance;

    System.out.print("Enter the scores for five subjects:");
    for (int i = 0; i < 5; i++) {
        scores[i] = scanner.nextDouble();
        total += scores[i];
    }
    System.out.print("Enter allowance fees:");
    allowance = scanner.nextDouble();
    double meanScore = total / 5;

    if (meanScore > 70) {
        allowance += allowance * 0.05;
    } else if (meanScore >= 50 && meanScore <= 69) {
        allowance += allowance * 0.02;
    } else {
        allowance += 0;
    }

    System.out.println("The new allowance fee is: " + allowance);
  }
}
