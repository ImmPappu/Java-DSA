package A9_BinarySearch;

public class PeakIndexMountainArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
                int n = arr.length;       //T.C O(n)
                for(int i=0;i<n-2;i++){
                    if(arr[i]<arr[i+1]){
                        if(arr[i+1]>arr[i+2]) {
                        }
                    }
                }
            }
        }

        //T.C = O(logn)
//        int low = 0;
//        int high = arr.length - 1;
//
//        while(low < high) {
//
//            int mid = low + (high - low) / 2;
//
//            if(arr[mid] < arr[mid + 1]) {
//                low = mid + 1;
//            } else {
//                high = mid;
//            }
//        }
//
