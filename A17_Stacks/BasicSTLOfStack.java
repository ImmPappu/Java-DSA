package A17_Stacks;

import java.util.Stack;

public class BasicSTLOfStack {
    static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");
        st.push("E");
        System.out.println(st.size());
        System.out.println(st);   //A.S = O(n)
        st.pop();
        System.out.println(st + " "+st.size());
        System.out.println(st.peek());  //Give "D"
        System.out.println(st.pop());   //Give "D" it return top most element and remove it
        String s = st.pop();

    }
}
