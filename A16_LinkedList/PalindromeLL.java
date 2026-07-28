package A16_LinkedList;
import java.util.ArrayList;
public class PalindromeLL {
    static void main(String[] args) {
        //Input :- 1 -> 2 -> 1 -> 1 -> 2 -> 1,
        //Output: true
        //Explanation: The given linked list is 1 -> 2 -> 1 -> 1 -> 2 -> 1, which is a palindrome.
    }
    static Node reverseList(Node head) {    //Iterative ways
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
    static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;       //Separating LL
        head2 = reverseList(head2); //Reversing second LL
        Node i = head;             //Comparing Using Two pointer
        Node j = head2;
        while(j!=null){
            if(i.val!=j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
}
