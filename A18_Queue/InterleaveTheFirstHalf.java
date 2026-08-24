package A18_Queue;
import java.util.*;
public class InterleaveTheFirstHalf {
    static void main(String[] args) {
        //Input: q = [2, 4, 3, 1]
        //Output: [2, 3, 4, 1]
        //Explanation: We place the first element
        // of the first half 2 and after that place
        // the first element of second half 3 and
        // after that repeat the same process one
        // more time so the resulting queue will
        // be [2, 3, 4, 1]
    }
}
class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // Queue <Integer> q2 = new LinkedList<>();
        // for(int i=1;i<=n/2;i++){
        //     q2.add(q.remove());
        // }
        // while(q2.size()>0){
        //         q.add(q2.remove());
        //         q.add(q.remove());
        // }

        //Using one stack Only
        Stack <Integer> st = new Stack<>();
        int n = q.size();
        for(int i = 1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i = 1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        //Now reversing The queue
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
    }
}

