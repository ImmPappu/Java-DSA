package A16_LinkedList;
public class RotateLinkedListByK {
    static void main(String[] args) {
        //Input: head = [1,2,3,4,5], k = 2
        //Output: [4,5,1,2,3]
    }
    public Node rotate(Node head, int k) {
        Node temp = head ;
        if(head==null || head.next==null) return head;
        int n = 0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        k=k%n;
        if(k==0) return head ;
        Node slow = head ;
        Node fast = head ;
        for(int i = 1;i<=k+1 ;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node a = slow.next;
        slow.next = null;
        Node t = a;
        while(t.next!=null){
            t=t.next;
        }
        t.next = head;
        return a;
    }
}
