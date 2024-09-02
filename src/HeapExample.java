public class HeapExample {
    int[] heap;
    int size;
    int capacity;
    boolean isMinHeap;

    HeapExample(int capacity, boolean isMinHeap) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
        this.isMinHeap = isMinHeap;
    }

    int getParent(int position) {
        return (position - 1) / 2;
    }

    int getLeft(int position) {
        return (position * 2) + 1;
    }

    int getRight(int position) {
        return (position * 2) + 2;
    }

    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    private void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public void insert(int element) {
        if (size >= capacity) {
            System.out.println("Heap is full!");
            return;
        }

        heap[size] = element;
        int current = size;

        // Heapify upwards
        if (isMinHeap) {
            // For Min-Heap
            while (current > 0 && heap[current] < heap[getParent(current)]) {
                swap(current, getParent(current));
                current = getParent(current);
            }
        } else {
            // For Max-Heap
            while (current > 0 && heap[current] > heap[getParent(current)]) {
                swap(current, getParent(current));
                current = getParent(current);
            }
        }
        size++;
    }

    public void run() {
        // Example of inserting elements
        insert(10);
        insert(20);
        insert(15);
        insert(30);
        insert(40);
        insert(5);
        insert(3);
        insert(50);

        // Print the heap after insertion
        printHeap();
    }

    public static void main(String[] args) {
        System.out.println("Max-Heap:");
        HeapExample maxHeapExample = new HeapExample(10, false);
        maxHeapExample.run();

        System.out.println("\nMin-Heap:");
        HeapExample minHeapExample = new HeapExample(10, true);
        minHeapExample.run();
    }
}
