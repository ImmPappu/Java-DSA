package A9_BinarySearch;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int low=0;
        int high=n-1;
        int target = 3;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
        }
    }
}
