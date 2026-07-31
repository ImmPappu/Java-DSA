package A16_LinkedList;

public class Deletion_Of_node_in_circularLL {
    static void main(String[] args) {

    }

    Node deleteNode(Node head, int key) {
        if (head == null) return null;        //head null hai toh null return

        if (head.val == key) {                // head ko hi hatana hai toh head ko ek aage shift kardo
            head = head.next;
        }

        Node tail = head;
        Node prev = head;

        while (tail.next != head && tail.next != null) {    //tail node ko last tak le jao aur tail ko null se attach kardo
            tail = tail.next;
        }
        tail.next = null;      //singly ll

        while (prev.next != null && prev.next.val != key) {     //prev node ko key node se ek piche rakho
            prev = prev.next;
        }
        if (prev.next != null) {                      // prev node ko key node se ek aage wale se connect karo
            prev.next = prev.next.next;
        }

        Node temp = head;                          //ab syd head badal chuka ho isliye phirse tail find karo aur tail
        while (temp.next != null) {                // ko head se attach karo
            temp = temp.next;
        }
        temp.next = head;

        return head;
    }
}
