package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;

class  Produer implements Runnable{
private ArrayBlockingQueue<Integer> queue;

    public Produer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                queue.put(BlockingQueue.count++);
                System.out.println("Value added into queue: "+BlockingQueue.count);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class  Consumer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
                queue.take();
                BlockingQueue.count--;
                System.out.println("Value removed into queue: "+BlockingQueue.count);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class BlockingQueue {
    static int count=0;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer>queue=new ArrayBlockingQueue<>(10);
        Produer produer=new Produer(queue);

        Thread ProducerThread=new Thread(produer);
        ProducerThread.start();

        Consumer consumer=new Consumer(queue);
        Thread consumerThread=new Thread(consumer);
        consumerThread.start();

    }
}
