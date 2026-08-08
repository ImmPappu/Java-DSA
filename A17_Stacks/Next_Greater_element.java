package A17_Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class Next_Greater_element {
    static void main(String[] args) {
        //Input: arr[] = [1, 3, 2, 4]
        //Output: [3, 4, 4, -1]
        //Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
        //Input: arr[] = [6, 8, 0, 1, 3]
        //Output: [8, -1, 1, 3, -1]
        //Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1, for 1 it is 3 and then for 3 there is no larger element on right and hence -1.
        //Input: arr[] = [1, 2, 3, 5]
        //Output: [2, 3, 5, -1]
        //Explanation: For a sorted array, the next element is next greater element also except for the last element.
        //Input: arr[] = [5, 4, 3, 1]
        //Output: [-1, -1, -1, -1]
        //Explanation: There is no next greater element for any of the elements in the array, so all are -1.
    }
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>st.peek()) st.pop();
            if(st.size()==0) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(nge[i]);
        }
    return ans;

    }
}
