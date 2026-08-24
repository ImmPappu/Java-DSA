package A18_Queue;
import java.util.*;
public class WinnerOfCircularGame {
    static void main(String[] args) {

    }
    public int findTheWinner(int n, int k) {
        Queue <Integer> q = new LinkedList<>();
        for(int i =1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            //k-1 element remove and add
            for(int i=1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove(); //kth element remove
        }
        return q.peek();
    }
}
