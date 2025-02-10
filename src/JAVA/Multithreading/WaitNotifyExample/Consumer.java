package JAVA.Multithreading.WaitNotifyExample;

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(1500); // Simulating time to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}