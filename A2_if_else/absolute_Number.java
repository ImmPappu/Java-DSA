package A2_if_else;

import java.util.Scanner;

public class absolute_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        if (n>=0) {
            System.out.println("Your number is " + n);
        }
        else {
            n = -n ;
            System.out.println(n);
        }
    }
}
