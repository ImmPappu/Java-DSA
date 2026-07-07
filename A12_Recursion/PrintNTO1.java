package A12_Recursion;

import java.util.Scanner;

public class PrintNTO1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // print(1,n);
    print(n);
}

public static void print(int n ){
    if(n==0) return ;
    System.out.println(n);  // will print n to 1
    print(n-1);
}
}
