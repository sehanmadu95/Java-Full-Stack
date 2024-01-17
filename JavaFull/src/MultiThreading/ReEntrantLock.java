package MultiThreading;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLock {
    static int counter=0;
    static Lock lock=new ReentrantLock();
    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                //after read that lock simultanious process
                // block and run in single thread
                lock.lock();
                try {
                    for (int x = 1; x <= 1000; x++) {
                        ReEntrantLock.counter++;
                    }
                } finally {
                    //after reach unlock lock release
                    lock.unlock();
                }



            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int x = 1; x <= 1000; x++) {
                        ReEntrantLock.counter++;
                    }
                } finally {
                    lock.unlock();
                }

            }
        });
    thread1.start();
    thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Value of counter is: "+ReEntrantLock.counter);

    }

    //beast controlling
    //prevent dealock
    //manual locking machanisam
    //if loop infinite unlock method not reach, so prevent that senario used try  finally block
    //and put unlock method inside finally block
}
