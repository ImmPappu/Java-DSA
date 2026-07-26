package A16_LinkedList;

public class RotateLinkedListByKfromLeft {
    static void main(String[] args) {
        //Input: 10 -> 20 -> 30 -> 40 -> 50 ; k = 4,
        //Output: 50 -> 10 -> 20 -> 30 -> 40
        //Explanation:
        //Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
        //Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
        //Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
        //Rotate 4: 50 -> 10 -> 20 -> 30 -> 40
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
        k = n-k;              //Main Line Agr size 5 hai aur k = 4 hai toh left se bas ek baar hi karenge isliye k=n-k;
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
