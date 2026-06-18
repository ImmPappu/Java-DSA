package A4_PatternPrinting;

import java.util.Scanner;

public class StarCross {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = input.nextInt();

        int mid = (n+1)/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==j ||i+j==6){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
