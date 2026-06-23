package A8_Basic_Sorting;

public class SelectionSortGreaterElement {
    static void main(String[] args) {
        int [] arr = {8,4,1,9,-3,6,5};
        int n = arr.length;

        for(int i=n-1;i>0;i--){

            int maxdx = 0;
            for(int j =1;j<=i;j++){
                if(arr[j]>arr[maxdx]){
                    maxdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
