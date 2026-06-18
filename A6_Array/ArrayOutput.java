package A6_Array;

import java.util.Scanner;

public class ArrayOutput {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //output

//        int[] arr = {5,6,9,6,7,-4};
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] +" ");
//        }
//
        // default values
        int[] arra =new int[5];


//        for (int i = 0; i < 5; i++) {
//            System.out.print(arra[i]+ " ");
//        }

        //Input

        for (int i = 0; i < 5; i++) {
            arra[i] = sc.nextInt();
        }

        //Print
        for (int i = 0; i < 5; i++) {
            System.out.print(arra[i]+" ");
        }
    }
}
