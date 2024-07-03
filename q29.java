import java.util.*;

public class q29 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    String op;
    double a, b, res=0;
    System.out.print("Enter two numbers: ");
    a = input.nextDouble();
    b = input.nextDouble();

    System.out.print("Enter the operator: ");
    op = input.next();

    switch(op){
      case "+":
        res = a + b;
        break;
      case "-":
        res = a - b;
        break;
      case "*":
        res = a * b;
        break;
      case "/":
        res = a / b;
        break;
      case "%":
        res = a % b;
        break;
      default:
        System.err.println("Invalid Input");
    }

    System.out.println("Result = " + res);
  }
}
