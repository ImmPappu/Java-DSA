package A4_PatternPrinting;

import java.util.Scanner;

public class OddNumberTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int odd =1;
            for (int j = 1; j <= i; j++) {
                    System.out.print(odd +" ");
                odd+=2;
                }

            System.out.println();
        }
    }
}
