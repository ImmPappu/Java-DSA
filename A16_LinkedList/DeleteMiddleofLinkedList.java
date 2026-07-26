package A16_LinkedList;

public class DeleteMiddleofLinkedList {
    static void main(String[] args) {
    //Input: LinkedList: 1->2->3->4->5
        //Output: 1->2->4->5
    }
    public Node deleteMid(Node head) {   //try to solve this using slow fast method
        Node slow = head;
        Node fast = head;
        Node temp = null;
        if(head==null || head.next==null) {
            return null;
        }
        while(fast!=null && fast.next!= null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        return head;

    }
}
