import java.util.*;

public class q20{
  public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner read = new Scanner(System.in);

    float[] a = new float[10]; 
    float sum=0, avg;
    System.out.print("Enter 10 floating numbers: ");
    for(int i=0; i<10; i++){
      a[i] = read.nextFloat();
      sum = sum + a[i];
    }
    avg = sum / 10;
    System.out.println("Sum = " + sum);
    System.out.println("Average = " + avg);
  }
}