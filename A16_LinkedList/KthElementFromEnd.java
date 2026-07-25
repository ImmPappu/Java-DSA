package A16_LinkedList;

public class KthElementFromEnd {
    static void main(String[] args) {

    }
    public int getKthFromLast(Node head, int k) {
        Node slow = head ;
        Node fast = head;
        //head ko k time chalaya
        for (int i = 1;i<=k ; i++){
            if(fast==null) return -1;  // agar k ka value size se jyada hai
            fast= fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
}
