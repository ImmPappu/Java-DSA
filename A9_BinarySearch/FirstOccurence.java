package A9_BinarySearch;

public class FirstOccurence {
    static void main(String[] args) {
        int [] arr = {1,2,2,2,5,6,7,8,9,10};
        int n = arr.length;
        int k =2 ;
        int low = 0;     //first occurence ke liye left lete jao
        int high = n-1 ;
        int idx1 =-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<k) low = mid+1;
            else if(arr[mid]>k){

                high = mid -1;
            }
            else { //arr[mid] == k
                idx1 = mid ;
                high = mid-1;
            }
        }
        System.out.println(idx1);
    }
}
