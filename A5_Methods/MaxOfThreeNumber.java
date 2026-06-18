package A5_Methods;

import java.util.Scanner;

public class MaxOfThreeNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(Math.max(Math.max(num1,num2),num3));
    }
}
