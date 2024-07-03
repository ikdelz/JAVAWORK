import java.util.Scanner;

public class q35 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the student's marks: ");
    int marks = scanner.nextInt();
    String grade;

    switch (marks / 10) {
      case 10:
      case 9:
      case 8:
          grade = "Excellent";
          break;
      case 7:
      case 6:
          grade = "Very Good";
          break;
      case 5:
          grade = "Good";
          break;
      default:
          grade = "Fail";
          break;
    }

    System.out.println("Grade: " + grade);
    }
}
