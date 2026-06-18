package A6_Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int temp0 = arr[0];
//        int temp1 = arr[1];
//        for(int i=0;i<arr.length-1;i++){
//           arr[i]=arr[i+2];
//
//        }
//        arr[arr.length-1]=temp1;
//        arr[arr.length-2]=temp2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        int d = sc.nextInt();
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        for(int ele :arr) {
            System.out.print(ele + " ");
        }
    }
}

