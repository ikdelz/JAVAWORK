import java.util.*;

public class q11 {
  public static void main(String[] args){
    int a, b, pdt;
    @SuppressWarnings("resource")
    Scanner read = new Scanner(System.in);
    System.out.print("Enter 2 numbers: ");
    a = read.nextInt();
    b = read.nextInt();
    pdt = a * b;

    if (pdt > 0) {
      System.out.println("Product(" + pdt +  ") is Greater than zero");
    } else if (pdt <0) {
      System.out.println("Product(" + pdt +  ") is less than zero");
    } else {
      System.out.println("Product(" + pdt +  ") is zero");
    }
  }
}
