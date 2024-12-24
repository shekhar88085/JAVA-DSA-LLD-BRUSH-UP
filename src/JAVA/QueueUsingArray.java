package JAVA;

class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    // Constructor to initialize queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0; // Index of the first element
        rear = -1; // Index where the next element will be added
        size = 0;  // Number of elements in the queue
    }

    // Enqueue method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Move rear to the next position circularly
        queue[rear] = value;
        size++;
    }

    // Dequeue method to remove and return the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue");
            return -1;  // Return a sentinel value indicating queue is empty
        }
        int dequeuedValue = queue[front];
        front = (front + 1) % capacity; // Move front to the next position circularly
        size--;
        return dequeuedValue;
    }

    // Front method to return the front element without removing it
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Nothing at the front");
            return -1;
        }
        return queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to return the current size of the queue
    public int size() {
        return size;
    }
}

// Test the ArrayQueue
public class QueueUsingArray {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);  // Create a queue with a capacity of 5

        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);  // This should show a queue overflow message

        // Display the front element
        System.out.println("Front element is: " + queue.front());

        // Dequeue elements from the queue
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Check the size of the queue
        System.out.println("Current queue size: " + queue.size());

        // Display the front element again
        System.out.println("Front element is: " + queue.front());
    }
}
