package A3_Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while (n!=0){
            int digit = n%10;
            reverse *=10;
            reverse = reverse+digit;
            n/=10;

        }
        System.out.println(reverse);
    }
}
