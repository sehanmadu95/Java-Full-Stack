package MultiThreading;


import java.util.concurrent.CountDownLatch;

class someThread2 extends Thread{
    private CountDownLatch latch;

    public someThread2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread Runing with thread name: "+Thread.currentThread().getName());
        System.out.println("Thread Execution completed");
        System.out.println("*******************************");
        latch.countDown();
    }
}
public class ContdwnLatch {
    public static void main(String[] args) {

        CountDownLatch latch=new CountDownLatch(4);
        someThread2 thread2=new someThread2(latch);
        someThread2 thread22=new someThread2(latch);
        someThread2 thread23=new someThread2(latch);
        someThread2 thread24=new someThread2(latch);


        thread2.start();
        thread22.start();
        thread23.start();
        thread24.start();

        try {
            latch.await(); //main thread wait untill realse latch lock all
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("I'm in main Thread: "+Thread.currentThread().getName());
    }
}
