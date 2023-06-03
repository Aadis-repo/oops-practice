import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // used as min heap and max heap
        pq.offer(9);
        pq.offer(2);
        pq.offer(4);
        pq.offer(3);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
