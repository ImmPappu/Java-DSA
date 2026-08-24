package A18_Queue;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class MyQueue{
    Node head;
    Node tail;
    int size;

    int remove(){
        if(size==0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }
    void add(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.val;
    }
    void display(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class LLImplementationOfQueue {
    static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.peek());
        q.display();


    }
}
