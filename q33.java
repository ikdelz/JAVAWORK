import java.util.Scanner;

public class q33 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the student's marks: ");
    int marks = scanner.nextInt();
    char grade;

    if (marks >= 70) {
      grade = 'A';
    } else if (marks >= 60) {
      grade = 'B';
    } else if (marks >= 50) {
      grade = 'C';
    } else if (marks >= 40) {
      grade = 'D';
    } else {
      grade = 'E';
    }

    System.out.println("Grade: " + grade);
  }
}
