import java.util.*;

public class q4 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner read = new Scanner(System.in);
        float a, b, c, delta, x1, x2;
        System.out.print("Enter the coefficients: ");
        a = read.nextFloat();
        b = read.nextFloat();
        c = read.nextFloat();

        delta = (b * b) - (4 * a * c);
        if (delta < 0){
            System.out.println("No real roots");
        } else if (delta == 0){
            x1 = (float) (-b / 2 * a);
            System.out.println("One real root = " + x1);
        } else {
            x1 = (float) (-b + Math.sqrt(delta) / 2 * a);
            x2 = (float) (-b - Math.sqrt(delta) / 2 * a);
            System.out.println("X1 = " + x1 + " X2 = " + x2);
        }
    }
}
