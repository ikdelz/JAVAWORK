import java.util.*;

public class q6 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner read = new Scanner(System.in);
        int pos;
        System.out.print("Enter the position: ");
        pos = read.nextInt();
        
        if(pos == 1){
            System.out.print("Gold Medal");
        } else if(pos == 2){
            System.out.print("Silver Medal");
        } else if(pos == 3){
            System.out.print("Bronze Medal");
        } else{
            System.out.print("Thank u for your participation");
        }
    }
}
