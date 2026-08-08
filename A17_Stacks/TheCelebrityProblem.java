package A17_Stacks;
import java.util.*;
public class TheCelebrityProblem {
    static void main(String[] args) {
    //Input: mat[][] = [[1, 1, 0],
        //                [0, 1, 0],
        //                [0, 1, 1]]
        //Output: 1
        //Explanation: 0th and 2nd person both know 1st person
        // and 1st person does not know anyone. Therefore, 1
        // is the celebrity person.
    }
    public int celebrity(int arr[][]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i<n ; i++){
            st.push(i);
        }
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            boolean aFlag = true , bFlag = true;
            if(arr[a][b]==1)  // a b ko janta hai , a celeb nhi hua
                aFlag = false;
            else // arr[a][b]==0  a b ko nhi janta b celeb nhi hai
                bFlag = false;
            if(arr[b][a]==1)  // b a ko janta hai , b celeb nhi hua
                bFlag = false;
            else // arr[b][a]==0  b a ko nhi janta a celeb nhi hai
                aFlag = false;
            if(aFlag) st.push(a);
            if(bFlag) st.push(b);
        }
        if(st.size()==0) return -1;
        int celeb = st.pop();
        for(int j = 0; j<n; j++){      // Check: celebrity should know nobody
            if(j==celeb) continue;
            if(arr[celeb][j]==1) return -1;
        }
        for(int i = 0; i<n; i++){       // Check: everyone should know celebrity
            if(i==celeb) continue;
            if(arr[i][celeb]==0) return -1;
        }
        return celeb;
    }

}
