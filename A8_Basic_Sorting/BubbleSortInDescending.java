package A8_Basic_Sorting;

public class BubbleSortInDescending {
   public static void main(String[] args) {
        int [] arr={5,9,3,-7,4,8};
        int n =  arr.length;

        for(int i = 0; i < n-1; i++){
            int swap = 0;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)break;
        }
    for(int ele :arr){
        System.out.print(ele+" ");
    }
    }


}
