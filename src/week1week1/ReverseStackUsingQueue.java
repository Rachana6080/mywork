package week1week1;

	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Stack;

	public class ReverseStackUsingQueue {
	    public static void reverseStack(Stack<Integer> stack) {
	        Queue<Integer> queue1 = new LinkedList<>();
	        Queue<Integer> queue2 = new LinkedList<>();

	        while (!stack.isEmpty()) {
	            queue1.add(stack.pop());
	        }

	        while (!queue1.isEmpty()) {
	            queue2.add(queue1.poll());
	        }

	        while (!queue2.isEmpty()) {
	            stack.push(queue2.poll());
	        }
	    }

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();

	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);
	        stack.push(5);

	        System.out.println("Original Stack: " + stack);

	        reverseStack(stack);

	        System.out.println("Reversed Stack: " + stack);
	    }
	}



