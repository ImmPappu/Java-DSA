package A16_LinkedList;

import java.util.Scanner;


public class DisplayList {
    public static void displayRec(Node head){
        if (head == null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);

    }
    public static void display(Node head){       // display(a)  head ==a
        Node temp = head;                        // temp = a    (int i = 0)
        while(temp!=null){                       //while(i!=0)
            System.out.println(temp.val+" ");     // print a.value
            temp = temp.next;                     //a = a.next;   i++;
        }

//        for(Node temp = head ; temp!=null ;temp = temp.next){
//            System.out.println(temp.val+" ");
//        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
       Node a = new Node(10);
       Node b = new Node(20);
       Node c = new Node(30);
       Node d = new Node(40);
       Node e = new Node(50);
       // Connect karna hai
       a.next = b; b.next = c;
       c.next = d; d.next = e;
       //display(a);
       //displayRec(a);
//        Node n = null;
//        n.val = 10;    Cannot assign field "val" because "n" is null
//        System.out.println(n.val);
//        System.out.println(n.next);   nullPointerException
        System.out.println(get(a,3)); //40
    }

    private static int get(Node head , int idx){
        Node temp =head;
        for(int i =1; i<=idx ;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
