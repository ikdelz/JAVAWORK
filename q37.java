public class q37 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        sum += i;
    }
    double average = sum / 100.0;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    }
}
