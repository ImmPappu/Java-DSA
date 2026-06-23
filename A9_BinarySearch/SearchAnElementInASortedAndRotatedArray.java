package A9_BinarySearch;

public class SearchAnElementInASortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {4,5,6,7,0,1,2};
        int target = 6;

        SearchAnElementInASortedAndRotatedArray obj = new SearchAnElementInASortedAndRotatedArray();

        int ans = obj.search(arr,target);
        System.out.println(ans);

    }
    int search(int[] arr, int tar) {
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==tar) return mid ;

            else if(arr[low]<=arr[mid]){
                if(arr[low]<=tar && tar< arr[mid]) high = mid -1;
                else low = mid+1;
            }

            else {
                if(arr[mid]<tar && tar<=arr[high])low = mid+1;
                else high = mid -1;
            }
        }
        return -1;
    }
}
