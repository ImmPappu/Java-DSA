package A4_PatternPrinting;

import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = sc.nextInt();
        char ch;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                if (i % 2 == 0) {
                    ch = (char) (j + 64);
                    System.out.print(ch);
                }else System.out.print(j);
            }
            System.out.println();
        }
    }
}

