package A2_if_else;

import java.util.Scanner;

public class SideOfTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First side of triangle");
        int a = input.nextInt();
        System.out.println("Enter the Second side of triangle");
        int b = input.nextInt();
        System.out.println("Enter the Third side of triangle");
        int c = input.nextInt();
        if (a+b>c && b+c>a && c+b>a){
            System.out.println("The triangle side of a valid triangle");
        }
        else {
            System.out.println("The triangle side of an invalid triangle");
        }
    }
}
