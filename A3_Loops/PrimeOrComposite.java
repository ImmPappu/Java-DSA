package A3_Loops;

import java.util.Scanner;

public class PrimeOrComposite {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to prime or composite:");
        int n = sc.nextInt();
        if (n<=1) {
            System.out.println("Neither Prime nor Composite number");
        }
        boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                  isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Composite");
            }
        }
}

