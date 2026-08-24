package A18_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class traversingAQueue {
    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 1;i<=n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove()); //peek show karke remove hokar piche se add ho ja rhe hai
        }
        System.out.println();
    }
    private static void addAtindex(Queue<Integer> q, int idx, int val) {
        if(idx<0 || idx>=q.size()){
            System.out.println("Invalid Index");
        }
        if(idx == q.size()){  //last mei direct add kar skte hai
            q.add(val);
        }
        int n = q.size();
        if(idx<n) {
            for (int i = 1; i <= idx; i++) {
                q.add(q.remove());
            }
        }
        q.add(val);
        for(int i = 1;i<=n-idx;i++){
            q.add(q.remove());
        }
    }
    private static void removeAtindex(Queue<Integer> q, int idx) {

    }
    private static int peek(Queue<Integer> q , int idx) {
        return 0;
    }
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        display(q);
        addAtindex(q,2,60);
        display(q);
    }


}
