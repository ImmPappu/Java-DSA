package A17_Stacks;

import java.util.Stack;

public class BalanceParenthesis {
    static void main(String[] args) {

    }

    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2!=0) return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') st.push(ch);
            else{ //ch is closing brackets
                if(st.size()==0) return false;
                char top = st.peek();
                if(SameStyle(top ,ch)) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }
    static boolean SameStyle(char a, char b) {
        if(a =='(' && b ==')') return true;
        if(a =='{' && b =='}') return true;
        if(a =='[' && b ==']') return true;
        return false;
    }
}
