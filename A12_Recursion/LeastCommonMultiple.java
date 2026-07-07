package A12_Recursion;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int Lcm = (a*b)/(gcd(a,b));
        System.out.println(Lcm);
    }
}
