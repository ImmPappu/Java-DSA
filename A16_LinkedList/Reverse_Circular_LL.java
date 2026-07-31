package A16_LinkedList;

public class Reverse_Circular_LL {
    static void main(String[] args) {
        //Input - 1 -> 2 -> 3-> 4 ->1 ...
        //Output - 4 -> 3 -> 2 -> 1 -> 4 ...
    }
        public Node reverse(Node head){
            Node prev = null;
            Node curr = head;
            Node forw = null;
            while(curr!=null){
                forw = curr.next;
                curr.next= prev;
                prev = curr;
                curr = forw;

            }
            return prev;
        }
        public Node reverseCircular(Node head) {
            if(head==null) return null;
            if(head.next==null) return head;
            Node tail = head;
            while(tail.next!= head){
                tail = tail.next;
            }
            tail.next = null;
            Node head2 = reverse(head);

            head.next = head2;

            return head2;

        }
    }
