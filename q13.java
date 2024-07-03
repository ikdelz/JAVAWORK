import java.util.Scanner;

public class q13 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("Enter the marks: ");    
    float marks = read.nextInt();

    int ch = (int) (marks / 10);
    switch(ch){
      case 10:
      case 9:
      case 8:
      case 7:
        System.out.println("Grade A");
      case 6:
        System.out.println("Grade B or C");
      case 5:
        System.out.println("Grade D");
      case 4:
        System.out.println("Grade E");
      case 5:
        System.out.println("Grade D");
    }
  }
}
