package A4_PatternPrinting;

import java.util.Scanner;
public class NumberTriangleVerticallyFlipped {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int count=1;
            for (int j = 1; j <= n; j++) { // isme total loop chalega n tak
                if((i+j)>n){
                    System.out.print(count++ +" ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

}
