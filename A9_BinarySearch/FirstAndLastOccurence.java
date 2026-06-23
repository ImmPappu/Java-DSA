package A9_BinarySearch;
import java.util.ArrayList;
public class FirstAndLastOccurence {
    static void main(String[] args) {
        int [] arr = {1,2,2,2,2,5,9,};
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int k =2;
        int low = 0;
        int high = n-1 ;
        int idx1 =-1;
        int idx2 =-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<k) low = mid+1;
            else if(arr[mid]>k){
                high = mid -1;
            }
            else {
                idx1 = mid ;
                high = mid-1;
            }
        }
        //Reset
        int low1 = 0;
        int high1 = n-1 ;
        while(low1<=high1){
            int mid = (low1+high1)/2;
            if(arr[mid]<k) low1 = mid+1;
            else if(arr[mid]>k){
                high1 = mid -1;
            }
            else {
                idx2 = mid ;
                low1 = mid +1;
            }
        }
        ans.add(idx1);
        ans.add(idx2);
        System.out.println(ans);
    }
}
