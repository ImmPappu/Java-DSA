package A12_Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);          //Time Complexity =O(2^n) / Exponential
                                                 //Auxilary Space = O(n) that is depth of recursive tree or Euler tree
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = fib(n);
        System.out.println(result);

    }
}
