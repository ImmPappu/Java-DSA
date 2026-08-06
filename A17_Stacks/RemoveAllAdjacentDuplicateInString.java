package A17_Stacks;
import java.util.Stack;
public class RemoveAllAdjacentDuplicateInString {
    static void main(String[] args) {
        //Input: s = "abbaca"
        //Output: "ca"
        //Explanation:
        //For example, in "abbaca" we could remove "bb" since the letters are
        // adjacent and equal, and this is the only possible move.
        // The result of this move is that the string is "aaca",
        // of which only "aa" is possible, so the final string is "ca".
    }
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size()!=0 && st.peek() ==ch){
                st.pop();
            }
            else{
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
