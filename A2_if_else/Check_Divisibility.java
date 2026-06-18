package A2_if_else;

import java.util.Scanner;

public class Check_Divisibility {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) System.out.println("Divisible by 5 and 3");
        else if (n % 3 == 0) System.out.println("Divisible by 3");
        else if ( n % 5 == 0) System.out.println("Divisible by 5");
        else System.out.println("Not divisible by 5 and 3");
    }
}
