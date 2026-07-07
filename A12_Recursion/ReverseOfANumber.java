package A12_Recursion;

import java.util.Scanner;

public class ReverseOfANumber {
    public static int reverse(int n , int r){
        if(n==0) return r;
        return reverse(n/10,r*10+n%10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        System.out.println(  reverse(n, 0));

    }
}
