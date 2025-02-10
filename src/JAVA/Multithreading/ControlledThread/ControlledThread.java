package JAVA.Multithreading.ControlledThread;

class ControlledThread implements Runnable {
    private volatile boolean suspended = false; // Flag to suspend thread
    private volatile boolean stopped = false; // Flag to stop thread

    Thread t;

    public ControlledThread(String name) {
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                synchronized (this) {
                    while (suspended) {
                        wait(); // Wait until notified
                    }
                    if (stopped) {
                        System.out.println(t.getName() + " Stopped.");
                        break;
                    }
                }
                System.out.println(t.getName() + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(t.getName() + " interrupted.");
        }
    }

    public synchronized void suspendThread() {
        suspended = true;
    }

    public synchronized void resumeThread() {
        suspended = false;
        notify(); // Notify waiting thread
    }

    public synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify(); // Ensure it exits if suspended
    }
}