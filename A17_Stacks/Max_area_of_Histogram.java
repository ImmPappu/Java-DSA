package A17_Stacks;
import java.util.Stack;
public class Max_area_of_Histogram {
    static void main(String[] args) {
        //Input: heights = [2,1,5,6,2,3]
        //Output: 10
        //Explanation: The above is a histogram where width of each bar is 1.
        //The largest rectangle is shown in the red area, which has an area = 10 units.
    }
    public static int getMaxArea(int heights[]) {
        int n = heights.length;
        Stack <Integer> st = new Stack<>();
        int[] nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i =n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        while(st.size()>0) st.pop();

        int[] pse = new int[n];
        pse[0] =-1;
        st.push(0);
        for(int i =1;i<n;i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i=0;i<n;i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
