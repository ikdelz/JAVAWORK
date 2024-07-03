import java.util.*;

public class q5 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner read = new Scanner(System.in);
        float sum = 0, avg;
        float[] a = new float[5];

        System.out.print("Enter marks for 5 students: ");
        for(int i=0; i<5; i++){
            a[i] = read.nextFloat();
            sum = sum + a[i];
        }
        avg = sum / 5;
        System.out.println("Average = " + avg);
    }
}
