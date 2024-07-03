import java.util.Scanner;

public class q32 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the student's marks: ");
    double marks = scanner.nextDouble();

    if (marks >= 70 && marks <=100) {
      System.out.print("Grade A");
    } else if (marks >= 60 && marks <= 69) {
      System.out.print("Grade B");
    } else if (marks >= 50 && marks <= 59) {
      System.out.print("Grade C");
    } else if (marks >= 40 && marks <= 49) {
      System.out.print("Grade D");
    } else if(marks < 40){
    System.out.print("Grade E");
    } else {
      System.out.print("Invalid");
    }
  }
}
