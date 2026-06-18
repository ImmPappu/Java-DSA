package A2_if_else;

import java.util.Scanner;

public class checking4DigitNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if(number > 999 && number < 10000){
            System.out.println("Four Digit Number");
        }
        else {
            System.out.println("Not Four Digit Number");
        }
    }
}
