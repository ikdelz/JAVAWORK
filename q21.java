import java.util.*;

public class q21 {
  public static void main(String[] args) {
    int pdt = 1;
    int[][] a = new int[3][3];
    @SuppressWarnings("resource")
    Scanner read = new Scanner(System.in);
    System.out.print("Enter 9 elements: ");
    
    for (int i=0; i<3; i++){
      for (int j = 0; j < 3; j++) {
        a[i][j] = read.nextInt();
        pdt = pdt * a[i][j];
      }
    }
    System.out.print("Product = " + pdt);
  }
}
