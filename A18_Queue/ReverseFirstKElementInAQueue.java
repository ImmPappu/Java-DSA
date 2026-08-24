package A18_Queue;
import java.util.*;
public class ReverseFirstKElementInAQueue {
    static void main(String[] args) {
        //Input: q = [1, 2, 3, 4, 5], k = 3
        //Output: [3, 2, 1, 4, 5]
        //Explanation: After reversing
        // the first 3 elements from the given queue the resultant
        // queue will be [3, 2, 1, 4, 5]
    }
    public static Queue<Integer> reverseK(Queue<Integer> q, int k) {
            if(k>q.size() || k<0) return q;
            Stack<Integer> st = new Stack<>();
            for(int i =1;i<=k;i++){
                st.push(q.remove());
            }
            while(!st.isEmpty()) {
                q.add(st.pop());
            }
            for(int i=1;i<=q.size()-k;i++){
                q.add(q.remove());
            }
            return q;
        }
    }

