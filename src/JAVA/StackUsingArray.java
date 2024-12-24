package JAVA;
public class StackUsingArray {
    // ArrayStack Class
    class ArrayStack {
        private int[] stack;
        private int top;
        private int capacity;

        // Constructor to initialize stack
        public ArrayStack(int capacity) {
            this.stack = new int[capacity];
            this.capacity = capacity;
            this.top = -1;
        }

        // Push method to add an element to the stack
        public void push(int data) {
            if (isFull()) {
                System.out.println("STACK OVERFLOW! CANNOT PUSH: " + data);
                return;
            }
            stack[++top] = data;  // Increment top first, then assign data
        }

        // Check if the stack is full
        private boolean isFull() {
            return top == capacity - 1;
        }

        // Pop method to remove and return the top element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("STACK UNDERFLOW! CANNOT POP");
                return -1;
            }
            return stack[top--];  // Return the top element and decrement top
        }

        // Check if the stack is empty
        private boolean isEmpty() {
            return top == -1;
        }

        // Peek method to return the top element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Nothing to peek");
                return -1;
            }
            return stack[top];
        }

        // Method to return the current size of the stack
        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        StackUsingArray outer = new StackUsingArray();  // Create an instance of the outer class
        ArrayStack stack = outer.new ArrayStack(5);  // Create an instance of the inner class

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);  // This should show a stack overflow message
        // Display the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Check the size of the stack
        System.out.println("Current stack size: " + stack.size());

        // Display the top element again
        System.out.println("Top element is: " + stack.peek());
    }
}
