package Strings;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String s = "";
        s += n;
        System.out.println(s);

        // String to Int
        String a = "944654";
        int b =Integer.parseInt(a);
        System.out.println(a);
    }
}
