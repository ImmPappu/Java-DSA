package A9_BinarySearch;

public class kthMissingPositiveNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,7,8,9};
        int k = 2;
        kthMissingPositiveNumber obj = new kthMissingPositiveNumber();
        int ans = obj.kthMissing(arr,k);
        System.out.println(ans);

    }
    public int kthMissing(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            int correctNo = mid +1;
            int missing = arr[mid]-correctNo;
            if(missing>=k) high = mid-1;
            else low = mid +1;
        }
        return low + k;
    }
}
