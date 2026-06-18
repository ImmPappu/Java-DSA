package A6_Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {564, 444, 456, 4};
        sorts(arr);
        Arrays.sort(arr);
        sorts(arr);
    }

    public static void sorts(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}