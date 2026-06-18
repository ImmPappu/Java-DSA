package A4_PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter number of column: ");
        int col = sc.nextInt();

        for(int i=1; i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
