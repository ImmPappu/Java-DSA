package A16_LinkedList;
import java.util.*;

public class merge_K_Sorted_List {
    static void main(String[] args) {

    }
//    public  merge(ListNode head1, ListNode head2) {
//    ListNode t1 = head1;
//    ListNode t2 = head2;
//    ListNode dummy = new ListNode(-1);
//    ListNode t = dummy;
//        if(head1==null && head2 == null) return null;
//        if(head1==null) return head2;
//        if(head2==null) return head1;
//        while(t1!=null && t2!=null){
//        if(t1.val<t2.val){
//            t.next=t1;
//            t1=t1.next;
//        }
//        else{
//            t.next=t2;
//            t2=t2.next;
//        }
//        t = t.next;
//    }
//        if(t1==null) t.next = t2;
//        else t.next = t1;
//        return dummy.next;
//}
//public ListNode mergeKLists(ListNode[] list) {
//    ArrayList<ListNode> arr = new ArrayList<>();
//    if(list.length == 0)
//        return null;
//    for(ListNode node : list){
//        arr.add(node);
//    }
//    while(arr.size()>1){
//        ListNode a = arr.remove(arr.size()-1);
//        ListNode b = arr.remove(arr.size()-1);
//        ListNode c = merge(a,b);
//        arr.add(c);
//
//    }
//    return arr.get(0);

//}
}
