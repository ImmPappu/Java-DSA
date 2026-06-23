package A8_Basic_Sorting;

import java.util.Arrays;

public class TwoSumPair {
    static void main(String[] args) {
        int[] arr = {1, 9, 7, 56, 5};
        int n = arr.length;
        int target = 16;
        Arrays.sort(arr);
        int i =0, j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.print(arr[i]+" "+arr[j]+" ");
                break;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }

        }
    }
}