import java.util.*;

public class q3 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner read = new Scanner(System.in);

        int b, h, area;
        System.out.print("Enter base and height: ");
        b = read.nextInt();
        h = read.nextInt();
        area = (b * h) / 2;

        System.out.println("Area = " + area);
    }
}
