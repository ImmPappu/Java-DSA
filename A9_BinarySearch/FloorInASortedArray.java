package A9_BinarySearch;

public class FloorInASortedArray {
    static void main(String[] args) {
        int [] arr ={1,2,3,4,6,8,9,15};
        int n = arr.length;
        int target = 9;
        int low = 0;
        int high = n-1;
        int idx=-1;

        while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]>target) {
            high = mid-1;
        }
        else {
            idx = mid;
            low = mid+1;
        }
        }
        System.out.println("Floor Index = " + idx);
        System.out.println("Floor Value = " + arr[idx]);
    }
}
