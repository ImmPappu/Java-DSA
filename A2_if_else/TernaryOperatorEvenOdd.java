package A2_if_else;

import java.util.Scanner;

public class TernaryOperatorEvenOdd {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println((num % 2 == 0) ? "Even" : "Odd");
    }
}
