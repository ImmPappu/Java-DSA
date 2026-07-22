package CyclicSort;
import java.util.*;
public class SetMismatch {
    public static void main(String[] args) {
     int[] arr = {1,5,4,6,3,2};
        findErrorNums(arr);
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    }
    public static int[] findErrorNums(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i= 0;
        while(i<arr.length){
            int rightidx = arr[i]-1;
            if(arr[i]==i+1 || arr[rightidx]==arr[i]) i++;
            else swap(arr,i,rightidx);
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
                return new int[]{arr[i], i + 1};
        }
        return new int[]{-1,-1};
    }

    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
