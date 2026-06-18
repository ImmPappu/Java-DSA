package A6_Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int[] brr = new int[arr.length];   //DeepCOpy
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
//        int[] x = arr; // x is a shallow copy of arr
//        x[0] = 100 ;

        int[] y = Arrays.copyOf(arr,arr.length);  //DeepCopy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);


    }
}
