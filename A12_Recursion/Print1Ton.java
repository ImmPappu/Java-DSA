package A12_Recursion;

import java.util.Scanner;

public class Print1Ton {
    static int n;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // print(1,n);
        print(1);
    }
//    public static void print(int n ){
//        if(n==0) return ;          //Base Case
//        print(n-1);                //Call         it will give 1 to 5
//        System.out.println(n);     //Work
//
//    }

    public static void print(int x ){
        if(x>n) return ;
        System.out.println(x);
        print(x+1);
    }
}
