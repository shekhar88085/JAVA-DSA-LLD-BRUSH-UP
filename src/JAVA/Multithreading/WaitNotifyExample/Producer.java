package JAVA.Multithreading.WaitNotifyExample;

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(1000); // Simulating time to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}