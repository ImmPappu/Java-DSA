package A16_LinkedList;

public class MergeTwoSortedLinkedList {
    static void main(String[] args) {

    }
    public Node mergeTwoLists(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(2);//-1
        Node t = dummy;
        if(head1==null && head2 == null) return null;
        if(head1==null) return head2;
        if(head2==null) return head1;
        while(t1!=null && t2!= null){
            if(t1.val<=t2.val){
                t.next=t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
        }
        if(t1==null) t.next=t2;
        else t.next=t1;
        return dummy.next;
    }
}
