package A3_Loops;

import java.util.Scanner;

public class DisplayingAP {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = input.nextInt();
        for (int i = 1; i <= 3*n-1; i=i+3) {  // n  is the number of term an=a+(n-1)*d
            System.out.println(i);
        }
    }
}
