package A18_Queue;
import java.util.LinkedList;
import java.util.Queue;
public class BasicSTLOfQueues {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        System.out.println(q.poll()); //remove
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q);
    }
}
