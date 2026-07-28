package A16_LinkedList;

public class ReverseALinkedList {
    static void main(String[] args) {

    }
    Node reverseList(Node head) {    //Iterative ways
        Node forw = null;
        Node pre = null;
        Node curr = head;
        while(curr!=null){
            forw=curr.next;
            curr.next=pre;
            pre=curr;
            curr=forw;
        }
        return pre;
    }
    // Node reverseList(Node head) {
    //         if(head==null || head.next==null) return head;
    //         Node a = head.next;
    //         head.next= null;
    //         Node b = reverseList(a);
    //         a.next = head;
    //         return b;
    //     }


    // Node reverseList(Node head) {   //ArrayList ways
    //     Node temp = head;
    //     ArrayList <Node> arr =new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     int n =arr.size();
    //     for(int i = n-1 ;i>=1 ;i--){
    //         arr.get(i).next=arr.get(i-1);
    //     }
    //     arr.get(0).next = null;
    //     return arr.get(n-1);
    // }
}
