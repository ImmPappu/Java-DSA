package A17_DoubleLL;
class ListNode {         //User defined data type
    ListNode next;
    ListNode prev;
    int val;
    public Node child;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size ;

    void addAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==0) {
            System.out.println("List is empty");
            return;
        }
        if(size==1) head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size==0) {
            System.out.println("List is empty");
            return;
        }
        if(size==1) head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
         System.out.println();
     }
    void displayreverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void insert(int idx, int val){
        ListNode a = new ListNode(val);
        ListNode temp = head;

        if(idx<0 || idx>size){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0) {
            addAtHead(val);
            return;
        }
        if(idx==size) {
            addAtTail(val);
            return;
        }
        for(int i=1;i<idx;i++) {
            temp = temp.next;
        }
            ListNode nextNode = temp.next;
            a.next = nextNode;
            a.prev = temp;
            temp.next = a;
            nextNode.prev = a;
            size++;
    }
}

public class doubleLinkedList_DataStructure {
    static void main(String[] args) {
        DLL list = new DLL();
        list.addAtHead(5);
        list.addAtHead(6);
        list.addAtHead(7);
        list.addAtHead(8);
        list.addAtTail(4);
//        list.display();
//        list.deleteAtHead();
//        list.display();
//        list.deleteAtTail();
//        list.display();
//        list.displayreverse();
        list.insert(2,454);
        list.display();




    }

}
