package A3_Loops;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact =1;
        while (n!=0){  // for(int i =1;i<=n;i++)  fact *=i 1*2*3*4*5
            fact*= n;
            n=n-1;
        }
        System.out.println("The Factorail is " + fact);
    }
}
