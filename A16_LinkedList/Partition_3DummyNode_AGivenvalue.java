package A16_LinkedList;

public class Partition_3DummyNode_AGivenvalue {
    static void main(String[] args) {
        //Input: head: 1->4->2->10, x = 3
        //Output: 1->2->4->10

        //Input: head: 1->4->3->2->5->2->3, x = 3
        //Output: 1->2->2->3->3->4->5
        //Explanation: Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.
    }
    public Node partition(Node head, int x) {
        Node d1 = new  Node(-1);
        Node d2 = new  Node(-1);
        Node d3 = new  Node(-1);
        Node t1 = d1;
        Node t2 = d2;
        Node t3 = d3;
        Node t  = head;
        while(t!=null ){
            if(t.val<x){
                t1.next = t;
                t1 = t1.next ;
            }
            else if (t.val>x){
                t2.next =t;
                t2 = t2.next;
            }
            else {
                t3.next = t ;
                t3 = t3.next;
            }
            t = t.next;
        }
        if(d3.next==null){
            t1.next = d2.next;
        }
        else{
            t1.next = d3.next;
            t3.next = d2.next;
        }
        t2.next =null;
        return d1.next;
    }
}
