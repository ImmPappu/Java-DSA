package A16_LinkedList;

class Node{
    int val;
    Node next;
        }

public class NodeOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node(); a.val = 1;
        Node b = new Node(); b.val = 2;
        Node c = new Node(); c.val = 3;
        Node d = new Node(); d.val = 4;
        Node e = new Node(); e.val =5;

        // Connect karna hai
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
    }
}
