import java.util.*;

public class q22 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    int[] a = new int[10];
    int sum = 0;
    System.out.print("Enter 10 numbers: ");
    for(int i=0; i<a.length; i++){
      a[i] = input.nextInt();
      sum = sum + a[i];
    }
    System.out.println("The sum is: "+ sum);
  }
}
