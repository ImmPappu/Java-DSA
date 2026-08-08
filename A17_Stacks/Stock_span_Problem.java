package A17_Stacks;

import java.util.Stack;
import java.util.ArrayList;

//class Pair{
//    int val;
//    int idx;
//    Pair(int val , int idx){
//        this.val = val;
//        this.idx = idx;
//    }
//}
public class Stock_span_Problem {
    static void main(String[] args) {
        int[] arr = {100 ,80 ,90,120};
        System.out.println(calculateSpan(arr));

        //Input: arr[] = [100, 80, 90, 120]
        //Output: [1, 1, 2, 4]
        //Explanation: Consider each day one by one:
        //Day 1 (100): Span = 1.
        //Day 2 (80): Span = 1 because the previous price (100) is greater than 80.
        //Day 3 (90): Span = 2 because 80 ≤ 90, but 100 > 90.
        //Day 4 (120): Span = 4 because 100, 80, and 90 are all less than or equal to 120.
        //Hence, the output is [1, 1, 2, 4].
    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for(int i = 1; i<n ;i++){
            while(st.size()>0 && arr[st.peek()] <= arr[i]) st.pop();
            if(st.size()==0) span[i] = i-(-1);
            else span[i] = i - st.peek();
            st.push(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n ; i++){
            ans.add(span[i]);
        }
        return ans;
    }
//    public static ArrayList<Integer> calculateSpan(int[] arr) {
//        int n = arr.length;
//        int[] span = new int[n];
//        Stack<Pair> st = new Stack<>();
//        span[0] = 1;
//        st.push(new Pair(arr[0],0));
//        for(int i = 1; i<n ;i++){
//            while(st.size()>0 && st.peek().val <= arr[i]) st.pop();
//            if(st.size()==0) span[i] = i-(-1);
//            else span[i] = i - st.peek().idx;
//            st.push(new Pair(arr[i],i));
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i = 0;i<n ; i++){
//            ans.add(span[i]);
//        }
//        return ans;
//    }
}
