package A2_if_else;

import java.util.Scanner;

public class Integercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        double n = sc.nextDouble();

        if (n == (int) n) {
            System.out.println(n + " is an integer");
        } else {
            System.out.println(n + " is not an integer");
        }
}
}