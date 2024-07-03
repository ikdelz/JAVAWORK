import java.io.*;

public class q8 {
  public static void main(String[] args){
    int a, b, c, pdt;
    try {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 3 numbers: ");
        a = Integer.parseInt(read.readLine());
        b = Integer.parseInt(read.readLine());
        c = Integer.parseInt(read.readLine());
        pdt = a * b * c;

        System.out.print("Product = " + pdt);
    } catch (IOException e) {
        System.out.print(e.getMessage());
    }
  }
}
