package A17_Stacks;
import java.util.*;
public class NumberOfVisiblePeopleInAQueue {
    static void main(String[] args) {
    //Input: heights = [10,6,8,5,11,9]
        //Output: [3,1,2,1,1,0]
        //Explanation:
        //Person 0 can see person 1, 2, and 4.
        //Person 1 can see person 2.
        //Person 2 can see person 3 and 4.
        //Person 3 can see person 4.
        //Person 4 can see person 5.
        //Person 5 can see no one since nobody is to the right of them.
    }
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = 0;
        for(int i = n-2 ;i>=0 ;i--){
            int count = 0;
            while(st.size()>0 && arr[i]>=st.peek()){
                count++;
                st.pop();
            }
            if(st.size()>0) count++; //agar stack mei element bacha hai tabhi next greater element mila
            ans[i] = count ;
            st.push(arr[i]);
        }
        return ans;
    }
}
