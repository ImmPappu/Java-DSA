package A17_Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek() throws Exception{
        if(head==null){
            throw new Exception("Stack is Underflow error");
        }
        return head.val;  // main
    }
    int pop() throws Exception{   //Method ke baad likhte hai
        if(head==null){
            throw new Exception("Stack is Underflow error");
        }
        int x = head.val;
        head = head.next;   // MAIN
        len--;
        return x;
    }

    void push(int ele){
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else {
            temp.next = head;  // MAin
            head = temp;
        }
        len++;
    }
    int size(){
        return len;   //Main
    }
    void display(){
        if(head==null){
            System.out.println("Stack is Underflow");
            return;
        }
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
public class LL_ImplementationOfStack {
    static void main(String[] args) throws Exception{   //Main ke andar parenthesis ke baad likhte hai
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());


    }
}
