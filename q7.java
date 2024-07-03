import java.util.*;

public class q7 {
    public static void main(String[] args) {
        int[] a;
        try (Scanner read = new Scanner(System.in)) {
            a = new int[50];
            System.out.print("Enter 50 numbers: ");
            for (int i = 0; i < 50; i++) {
                a[i] = read.nextInt();
            }
        }
        
        // sorting in descending order
        for (int i = 0; i < 50; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Elements in descending order:");
        for (int i = 0; i < 50; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
