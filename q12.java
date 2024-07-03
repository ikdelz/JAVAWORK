import java.util.*;

public class q12 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    double marks;
    System.out.println("Enter your marks");
    marks = input.nextDouble();

    if (marks <= 100 && marks >= 70) {
      System.out.println("Excellent");
    } else if (marks <= 69.99 && marks >= 65) {
      System.out.println("Very good");
    } else if (marks <= 64.99 && marks >= 60) {
      System.out.println("Good");
    } else if (marks <= 59.99 && marks >= 50) {
      System.out.println("Satisfactory");
    } else if (marks <= 49.99 && marks >= 40) {
      System.out.println("Adequate");
    } else if (marks <= 39.99 && marks >= 20) {
      System.out.println("Fair");
    } else if (marks >= 0 && marks <= 19.99) {
      System.out.println("Fail");
    } else {
      System.out.println("Invalid marks");
    }
  }
}
