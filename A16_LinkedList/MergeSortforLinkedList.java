package A16_LinkedList;

public class MergeSortforLinkedList {
    static void main(String[] args) {

    }
    public  Node mergeSort(Node head) {     //MergeSort
        if(head.next==null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head = mergeSort(head);
        head2 = mergeSort(head2);
        return sortedMerge(head ,head2);

    }
    Node sortedMerge(Node head1, Node head2) {    //Merging of Two Sorted LinkedList
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
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
