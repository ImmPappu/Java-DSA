package A16_LinkedList;

public class SegregateEvensandOddinaLinkedList {
    static void main(String[] args) {
        //Input: 17 -> 15 -> 8 ->9 -> 2 -> 4 -> 6
        //Output: 8 -> 2 -> 4 -> 6 -> 17 -> 15 -> 9
        //Explanation: Since 8, 2, 4, and 6 are even, they appear
        // first in the list, followed by the odd numbers 17, 15, and 9.
    }
    Node divide(Node head) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-2);
        Node t1 = d1;
        Node t2 = d2;
        Node t  = head;
        while(t!=null ){
            if(t.val%2==0){
                t1.next = t;
                t1 = t1.next ;
            }
            else{
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1 .next = d2 .next;
        t2.next =null;
        return d1.next;
    }
}
