package A2_if_else;

import java.util.Scanner;

public class GreatestAmongThree {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a =input.nextInt();
        System.out.println("Enter Second Number: ");
        int b=input.nextInt();
        System.out.println("Enter Third Number: ");
        int c=input.nextInt();

        if(a>=b && a>=c) System.out.println(a);
        else if(b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }
}
