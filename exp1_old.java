import java.util.*;

public class exp1_old {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String result;
        System.out.println("Enter ages of 3 people A, B, C:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            result = "All are of the same age.";
        } else if (a > b && a > c) {
            result = "A is the oldest.";
        } else if (b > a && b > c) {
            result = "B is the oldest.";
        } else if (c > a && c > b) {
            result = "C is the oldest.";
        } else {
            result = "There is a tie for the oldest.";
        }

        System.out.println(result);
    }
}
