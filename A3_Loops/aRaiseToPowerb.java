package A3_Loops;

import java.util.Scanner;

public class aRaiseToPowerb {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int pow =1 ;
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        System.out.println(pow);
    }
}
