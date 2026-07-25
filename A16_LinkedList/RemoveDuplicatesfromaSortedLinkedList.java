package A16_LinkedList;

public class RemoveDuplicatesfromaSortedLinkedList {
    static void main(String[] args) {
        //Input: Head: 2->2->4->5
        //Output: 2 -> 4 -> 5
    }
    Node removeDuplicates(Node head) {
        Node i = head;
        Node j = head;
        while(j!=null){
            if(i.val==j.val) j = j.next;
            else{
                i.next = j;
                i=j;
            }
        }
        i.next = j;
        return head;
    }
}
