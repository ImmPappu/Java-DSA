package A4_PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangleHorizontallyFlipped {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char)(j+96) +" ");
            }
            System.out.println();
        }
    }
}
