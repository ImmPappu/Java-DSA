package A2_if_else;
import java.util.Scanner;
public class oddeven {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");

        }
    }
}
