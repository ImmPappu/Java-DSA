package A8_Basic_Sorting;

public class kthSmallest {
    static void main(String[] args) {
        int [] arr = {4,58,5,6,4,2,8,87};
        int k = 3;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
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
        System.out.println(arr[k-1]);
    }
}
//Arrays.sort(arr);
//sout("arr[k-1];