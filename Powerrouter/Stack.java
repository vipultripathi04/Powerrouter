import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    private Queue<Integer> primaryQueue = new LinkedList<>();
    private Queue<Integer> secondaryQueue = new LinkedList<>();

    public void push(int value) {
        // Add the new element to the primary queue
        primaryQueue.offer(value);

        // Move elements from the secondary queue to maintain the order
        while (!secondaryQueue.isEmpty()) {
            primaryQueue.offer(secondaryQueue.poll());
        }

        // Swap the names of the queues
        Queue<Integer> temp = primaryQueue;
        primaryQueue = secondaryQueue;
        secondaryQueue = temp;
    }

    public int pop() {
        if (isEmpty()) {
           System.out.println("Stack is empty");
        }

        return secondaryQueue.poll();
    }

    public int top() {
        if (isEmpty()) {
    System.out.println("Stack is empty");
        }

        return secondaryQueue.peek();
    }

    public boolean isEmpty() {
        return secondaryQueue.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
    }
}
