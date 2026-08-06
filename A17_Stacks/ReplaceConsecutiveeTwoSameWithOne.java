package A17_Stacks;
import java.util.Stack;
public class ReplaceConsecutiveeTwoSameWithOne {
    static void main(String[] args) {
        //Input: s = "aabaa"
        //Output: "aba"
        //Explanation: The character 'a' at index 2 is the same as 'a' at index 1,
        // so it is removed. The character 'a' at index 5 is the same as 'a'
        // at index 4, so it is removed. The final string is "aba".
    }
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<>();
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if (st.isEmpty() || st.peek() != ch) {
                    st.push(ch);
                }
            }
            StringBuilder ans = new StringBuilder();
            while(st.size()!=0){
                ans.append(st.pop());
            }
            return ans.reverse().toString();
        }
    }