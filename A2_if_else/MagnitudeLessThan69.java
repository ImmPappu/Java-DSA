package A2_if_else;

import java.util.Scanner;

public class MagnitudeLessThan69 {
    static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of magnitude : ");
        int n = input.nextInt();
        if(n>0 && n<69) System.out.println("Yes");
        else if (n<0) {
            n = -n;
            if (n < 69) System.out.println("Yes");
            else System.out.println("No");
        }
        else System.out.println("No");
        }
    }

