package A4_PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { // isme total loop chalega n tak
                if((i+j)>n){
                    System.out.print((char)(i+64) +" ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
