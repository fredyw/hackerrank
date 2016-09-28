package hackerrank.ctci;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
 */
public class ATaleOfTwoStacks {
    private static class MyQueue<T> {
        private Stack<T> stack1 = new Stack<>();
        private Stack<T> stack2 = new Stack<>();

        public void enqueue(T element) {
            stack1.push(element);
        }

        public void dequeue() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public T peek() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            T val = stack2.peek();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return val;
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int operation = scan.nextInt();
                if (operation == 1) { // enqueue
                    queue.enqueue(scan.nextInt());
                } else if (operation == 2) { // dequeue
                    queue.dequeue();
                } else if (operation == 3) { // print/peek
                    System.out.println(queue.peek());
                }
            }
        }
    }
}
