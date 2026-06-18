package A4_PatternPrinting;

import java.util.Scanner;

public class Diamond {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = input.nextInt();

        int nsp = n / 2, nst = 1;

        for (int i = 1; i <= n / 2 +1; i++) {

            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
                System.out.println();
                nsp--;
                nst += 2;
            }


            nsp = 1;
            nst = n - 2;  //5 hai 7-2

            for (int i = 1; i <= n / 2; i++) {

                for (int j = 1; j <= nsp; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("* ");
                }

                System.out.println();
                nsp++;
                nst -= 2;
        }
    }
}
