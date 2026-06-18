package A6_Array;

import java.util.Scanner;

public class MinOfAllArrayElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();


        int arr[] = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min= arr[0]; // Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
         System.out.println("The minimum number is " + min);
    }
}
