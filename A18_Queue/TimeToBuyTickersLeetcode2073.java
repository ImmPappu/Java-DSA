package A18_Queue;
import java.util.*;
    class Person {
        int tickets;
        int index;
        Person(int tickets, int index) {
            this.tickets = tickets;
            this.index = index;
        }
    }
    public class TimeToBuyTickersLeetcode2073 {
        public int timeRequiredToBuy(int[] tickets, int k) {
            Queue <Person> q = new LinkedList<>();
            for(int i=0;i<tickets.length;i++){
                q.add(new Person(tickets[i],i));
            }
            int time = 0;
            while(q.size()>0){
                Person p = q.remove();
                p.tickets--;  //hum ticket ko minus karte jayeneg aur time ko increase karte jayenge
                time++;

                if(p.index==k && p.tickets==0){
                    return time;
                }
                if(p.tickets>0){
                    q.add(p);
                }
            }
        return time;
    }
}

