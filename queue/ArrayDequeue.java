package Collcetions.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String[] args) {
        
        Deque<String> deque = new ArrayDeque();

        
        deque.addFirst("First");
        deque.addLast("Second");
        deque.addFirst("Zero");
        deque.addLast("Third");

        
        System.out.println("Deque after additions: " + deque);

       
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

       
        System.out.println("Deque after removals: " + deque);
    }
}



