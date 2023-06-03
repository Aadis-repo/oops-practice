import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String[] args) {
        // doubly ended queue
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(33);
        // offer adds in last
        adq.offerFirst(1);
        adq.offerLast(49);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekLast());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
    }
}
