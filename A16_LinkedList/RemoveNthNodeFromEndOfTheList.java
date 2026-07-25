package A16_LinkedList;

public class RemoveNthNodeFromEndOfTheList {
    static void main(String[] args) {

    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     Node next;
     *     Node() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public Node removeNthFromEnd(Node head, int n) {
            Node slow = head;
            Node fast = head;

            for(int i = 1; i <= n; i++){
                fast = fast.next;
            }

            if(fast == null)
                return head.next;

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
            return head ;

        }
    }
}
