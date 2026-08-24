package A18_Queue;
import java.util.*;
public class FirstNegativeInWindowOfSizeK {
    static List<Integer> firstNegInt(int arr[], int k) {
        //Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
        //Output: [-8, 0, -6, -6]
        //Explanation:
        //Window [-8, 2] First negative integer is -8.
        //Window [2, 3] No negative integers, output is 0.
        //Window [3, -6] First negative integer is -6.
        //Window [-6, 10] First negative integer is -6.
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) q.add(i);
        }
        for(int i=0;i<n-k+1;i++){
            //window is from i to i+k-1
            while(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek() <= i+k-1) ans.add(arr[q.peek()]);
            else ans.add(0);
        }
        return ans;
    }
}
