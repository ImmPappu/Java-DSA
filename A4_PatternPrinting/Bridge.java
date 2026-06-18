package A4_PatternPrinting;
import java.util.Scanner;
public class Bridge {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = input.nextInt();
        int nsp=-1;
        for (int i = 1; i <= n; i++) {

              //left stars

            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }

            //middle spaces

            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }

            //RightStars
            int rightstars;
            if(i==1) {
                rightstars = n-1;
            }
            else {
                rightstars = n-i+1;
            }

            for (int j = 1; j <=rightstars; j++) {
                System.out.print("* ");
            }

            System.out.println();

            nsp+=2;
        }
    }
}
