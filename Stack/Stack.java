package Stack;

public class Stack {
	    private int maxSize;
	    private int[] stackArray;
	    private int top;

	   
	    public Stack(int size) {
	        this.maxSize = size;
	        this.stackArray = new int[maxSize];
	        this.top = -1;
	    }

	    
	    public void push(int value) {
	        if (isFull()) {
	            System.out.println("Stack is full. Unable to push " + value);
	            return;
	        }
	        stackArray[++top] = value;
	    }

	    
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Unable to pop.");
	            return -1; 
	        }
	        return stackArray[top--];
	    }

	    
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Unable to peek.");
	            return -1; 
	        }
	        return stackArray[top];
	    }

	    
	    public boolean isEmpty() {
	        return (top == -1);
	    }

	    
	    public boolean isFull() {
	        return (top == maxSize - 1);
	    }

	
	    public int size() {
	        return top + 1;
	    }

	    
	    public static void main(String[] args) {
	        Stack stack = new Stack(5);

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	        System.out.println("Top element is: " + stack.peek());

	        while (!stack.isEmpty()) {
	            System.out.println("Popped element: " + stack.pop());
	        }
	    }
	}



