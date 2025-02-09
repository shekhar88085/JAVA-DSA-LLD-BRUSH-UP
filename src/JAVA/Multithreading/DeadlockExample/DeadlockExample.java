package JAVA.Multithreading.DeadlockExample;

class DeadlockExample implements Runnable {
    private Resource resource1;
    private Resource resource2;

    public DeadlockExample(Resource r1, Resource r2) {
        this.resource1 = r1;
        this.resource2 = r2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " locked " + resource1.name);

            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " waiting to lock " + resource2.name);

            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2.name);
            }
        }
    }
}