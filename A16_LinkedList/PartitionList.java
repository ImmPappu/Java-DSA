package A16_LinkedList;
class ListNode {   //User defined data type
    int val;
    Node next;  //Null
    ListNode(int val){
        this.val = val;
    }
}
public class PartitionList {
    static void main(String[] args) {
        //Input: head = [1,4,3,2,5,2], x = 3
        //Output: [1,2,2,4,3,5]
    }
//    public ListNode partition(ListNode head, int x) {
//        ListNode d1 = new ListNode(-1);
//        ListNode d2 = new ListNode(-2);
//        ListNode t1 = d1;
//        ListNode t2 = d2;
//        ListNode t  = head;
//        while(t!=null ){
//            if(t.val<x){
//                t1.next = t;
//                t1 = t1.next ;
//            }
//            else{
//                t2.next = t;
//                t2 = t2.next;
//            }
//            t = t.next;
//        }
//        t1 .next = d2 .next;
//        t2.next =null;
//        return d1.next;
//    }
}
