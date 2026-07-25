package A16_LinkedList;

public class MiddleOfLinkedlist {
    static void main(String[] args) {

    }
    int getMiddle(Node head) {
    Node slow = head;         //Slow & Fast methods
    Node fast = head;
    while(fast !=null && fast.next!= null){  //Agr hum pehle fast.next rakhte toh fast hamara
        slow = slow.next;                    //null par already hota jisse null pointer exception aata
        fast= fast.next.next;
    }
    return slow.val;


//        Node temp = head;
//        int size = 0;
//        while (temp != null) {
//            temp = temp.next;
//            size++;
//        }
//
//        temp = head;
//        int mid = size / 2;
//
//        for (int i = 1; i <= mid; i++) {
//            temp = temp.next;
//        }
//        return temp.val;
    }
}
