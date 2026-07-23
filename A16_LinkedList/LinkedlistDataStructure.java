package A16_LinkedList;
class Node {   //User defined data type
    int val;
    Node next;  //Null
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{//user define data structure
    Node head;
    Node tail;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail =temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    void adAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head= tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }
    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedlistDataStructure {
    public static void main(String[] args) {

    }
}
