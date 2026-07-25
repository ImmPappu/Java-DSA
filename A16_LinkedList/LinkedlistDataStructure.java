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
    int size;
    void addAtTail(int val){
        if(tail==null){
            addAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head= tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteAtHead() {
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        else {
            head = head.next;
            if(head == null) tail = null;
        }
        size--;
    }
    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int search(int val){
        int idx = 0;
        if(head == null) return -1;
        Node temp = head;
        while(temp!=null){
            if(temp.val==val) return idx ;
            temp = temp.next;
            idx ++;
        }
        return -1;
    }
    void insert(int val , int idx) {
        if(idx<0 || idx>size) System.out.println("Index Out of Bounds");
        if(idx==0) addAtHead(val);
        else if (idx==size) addAtTail(val);
        else {
            Node temp = head;
            for(int i = 1 ; i<=idx-1 ;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next =t;
            size++;
        }

    }
    int get(int idx){
        Node temp = head ;
        for(int i =1 ;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void delete(int idx) {
        if(idx <0 || idx>=size){
            System.out.println("Index Out of Bounds");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
    Node temp = head;
    for (int i =1 ; i<=idx-1 ;i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;  //deleting
    if(idx==size-1); tail = temp;  // agar tail delete kar rhe hai toh piche bhi lana hai
    size--;
    }
}

public class LinkedlistDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtHead(50);
        ll.addAtTail(60);
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.search(40));
        ll.insert(45,2);
        ll.display();



    }
}
