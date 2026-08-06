package A17_Stacks;
import java.util.Stack;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class RemoveNodeFromLinkedList {
    static void main(String[] args) {
        //Input: head = [5,2,13,3,8]
        //Output: [13,8]
        //Explanation: The nodes that should be removed are 5, 2 and 3.
        //- Node 13 is to the right of node 5.
        //- Node 13 is to the right of node 2.
        //- Node 8 is to the right of node 3.
    }
    public ListNode removeNodes(ListNode head){
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            if(st.size()==0) st.push(temp);
            else if (st.peek().val >= temp.val) st.push(temp);
            else {
                while ( st.size()>0 &&st.peek().val < temp.val ){
                    st.pop();
                }
                st.push(temp);
            }
            temp = temp.next;
        }
        ListNode t = null;
        while(st.size()>0) {

            ListNode node = new ListNode(st.pop().val);
            node.next = t;
            t = node;
        }
        return t;
    }
}
