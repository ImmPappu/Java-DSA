package A8_Basic_Sorting;

public class SelectionSort {
   public static void main(String[] args) {
       int [] arr = {5,9,7,-4,3,7,60};
       int n = arr.length;
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();

       for (int i = 0; i < n-1; i++) {
           int min = Integer.MAX_VALUE;
           int mindx = 0;
           for(int j = i;j < n ;j++){
               if(arr[j]<min){
                   min=arr[j];
                   mindx=j;
               }
           }
           //swaps
           int temp = arr[i];
           arr[i] = arr[mindx];
           arr[mindx] = temp;
       }
       for(int element : arr){
           System.out.print(element+" ");
       }

    }
}
 