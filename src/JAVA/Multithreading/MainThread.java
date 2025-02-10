package JAVA.Multithreading;

import java.util.Optional;

public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.toString());
        System.out.println(t.getName());
        t.setName("Edar New Main Thread");  
        System.out.println(t.getName());
    }
}
