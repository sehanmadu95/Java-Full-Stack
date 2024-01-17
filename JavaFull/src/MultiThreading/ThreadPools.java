package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
    String threadName;

    public SomeThread( String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Starting Thread: "+threadName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Running Thread: "+threadName);
    }
}
public class ThreadPools {
    public static void main(String[] args) {

        SomeThread thread1=new SomeThread("Thread 1");
        SomeThread thread2=new SomeThread("Thread 2");
        SomeThread thread3=new SomeThread("Thread 3");
        SomeThread thread4=new SomeThread("Thread 4");
        SomeThread thread5=new SomeThread("Thread 5");
        SomeThread thread6=new SomeThread("Thread 6");

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);

        executorService.shutdown();


    }
}
