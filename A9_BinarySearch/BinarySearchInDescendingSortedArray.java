package A9_BinarySearch;

public class BinarySearchInDescendingSortedArray {
    static void main(String[] args) {
        int [] arr = {100,91,87,76,66,43,35,29,13,5};
        int n = arr.length;
        int low=0;
        int high=n-1;
        int target = 43;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>target){
                low=mid+1;
            }
            else if(arr[mid]<target){
                high=mid-1;
            }
        }
    }
}
