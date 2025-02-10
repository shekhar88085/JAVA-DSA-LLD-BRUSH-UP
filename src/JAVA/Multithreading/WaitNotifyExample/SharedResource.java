package JAVA.Multithreading.WaitNotifyExample;

class SharedResource {
    private int data;
    private boolean hasData = false; // Flag to check if data is available

    // Consumer waits if no data is available
    public synchronized int consume() {
        while (!hasData) {
            try {
                wait(); // Wait until producer notifies
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasData = false; // Mark data as consumed
        notify(); // Notify producer to produce new data
        System.out.println("Consumed: " + data);
        return data;
    }

    // Producer produces data and notifies consumer
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // Wait until consumer consumes data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        hasData = true; // Mark data as available
        notify(); // Notify consumer that data is available
        System.out.println("Produced: " + data);
    }
}