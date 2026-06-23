package A8_Basic_Sorting;

public class BubbleSortGreaterElement {
    public static void main(String[] args) {
        int [] arr = {8,4,1,9,-3,6,5};
        int n = arr.length;

        for (int i =0;i<n-1;i++){
            int swap = 0;
            for (int j =n-1-i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                swap++;
            }
            if(swap==0) break;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
