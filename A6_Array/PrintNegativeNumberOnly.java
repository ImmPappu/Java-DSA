package A6_Array;

import java.util.Scanner;

public class PrintNegativeNumberOnly {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements in the array: ");

        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //Printing Negative Values
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.print(arr[i] +" ,");
                    }

    }
}
