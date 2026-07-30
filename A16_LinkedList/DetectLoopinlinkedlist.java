package A16_LinkedList;

public class DetectLoopinlinkedlist {
    static void main(String[] args) {

    }
    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    boolean isCircular(Node head) {
           if (head == null) {
        return true;
    }

    Node temp = head.next;

    while (temp != null && temp != head) {
        if(temp.next==head) return true;
        temp = temp.next;
    }
    return false;
}

}
