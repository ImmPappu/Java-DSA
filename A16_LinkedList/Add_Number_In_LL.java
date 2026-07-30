package A16_LinkedList;

public class Add_Number_In_LL {
    static void main(String[] args) {

    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node forw = null;
        while(curr!= null){
            forw = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = forw;
        }
        return prev;
    }

    public Node addTwoLists(Node head1, Node head2) {
        while(head1 != null && head1.val == 0){
            head1 = head1.next;
        }
        while(head2 != null && head2.val == 0){
            head2 = head2.next;
        }

        if(head1==null) head1 = new Node(0);
        if(head2==null) head2 = new Node(0);

        head1 = reverse(head1);
        head2 = reverse(head2);
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node t = dummy;

        int carry = 0;

        while(t1!=null || t2!=null){
            int x =(t1!=null) ? t1.val : 0;
            int y =(t2!=null) ? t2.val : 0;
            int sum = carry + x + y ;
            if(sum>9){
                carry = 1;
            }
            else { carry = 0; }
            sum = sum%10;
            Node a = new Node(sum);
            t.next = a;
            t = t.next;
            if(t1!=null)t1 = t1.next;
            if(t2!=null)t2 = t2.next;
        }
        if(carry!=0) t.next = new Node(carry);

        Node rev = reverse(dummy.next);
        while(rev != null && rev.next!=null && rev.val == 0){
            rev = rev.next;
        }

        return rev;
    }
}
