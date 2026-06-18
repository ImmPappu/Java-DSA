package A6_Array;

import java.util.Scanner;

public class ProductOfElementOfArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int product = 1;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        System.out.println("The product of elements in the array is: " + product);


    }
}
