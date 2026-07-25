package A16_LinkedList;

public class FirstNodeofLoopinLinkedList {
    static void main(String[] args) {

    }
    public int cycleStart(Node head) {
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast == null || fast.next == null)
            return -1;
        while(slow!=temp){
            temp=temp.next;
            slow=slow.next;
        }
        return temp.val;

    }
}
