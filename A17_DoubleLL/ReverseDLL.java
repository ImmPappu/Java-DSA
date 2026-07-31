package A17_DoubleLL;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class ReverseDLL {
    static void main(String[] args) {

    }
    public Node reverse(Node head) {
        Node curr = head;
        Node pre = null;
        Node forw = null;
        while(curr!=null){
            forw = curr.next;
            curr.next = pre;
            curr.prev = forw;  //added line
            pre = curr;
            curr = forw;
        }
        return pre;

    }
}
