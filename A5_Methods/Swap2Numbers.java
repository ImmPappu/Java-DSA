package A5_Methods;

import java.util.Scanner;

public class Swap2Numbers {
    public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After swaping "+a+" to "+b);

    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       swap(a,b);
    }
}
