package A4_PatternPrinting;

import java.util.Scanner;

public class HollowRectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = input.nextInt();
        System.out.println("Enter the column: ");
        int column = input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if(i== 1 || i == row || j==1 || j == column){
                    System.out.print("* ");
                }
                else System.out.print("# ");
            }
            System.out.println();
        }
    }
}
