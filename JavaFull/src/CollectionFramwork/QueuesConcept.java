package CollectionFramwork;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueuesConcept {
    public static void main(String[] args) {


        Queue<Integer> queue=new LinkedBlockingQueue<>();
        queue.add(12);
        queue.add(1);
        queue.add(4);
        queue.add(5);
        queue.add(1);

        for (int x:queue
             ) {
            System.out.println(x);
        }

        Queue<Integer> arrQueue=new ArrayBlockingQueue<>(5);
        arrQueue.add(1);
        arrQueue.add(5);
        arrQueue.remove();

        //return head lement of the queue
        System.out.println(queue.element());

        arrQueue.offer(5);//add elemet witthout exception

        arrQueue.poll();//remove element without exception

        arrQueue.peek();//return head element if have

    }
}
//FIFO

/**
Types( highr - level)
    Array backed queue
    LinkedList backed queue
    Blocking queue : block null value
    Priority queue : Elemet arranged based on order


 insert / remove / examine

 */
