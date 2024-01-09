package CollectionFramwork;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class DeQueue {
    public static void main(String[] args) {
        //Double ended queue

        Queue<Integer>deQueue=new LinkedBlockingDeque<>();
    }
}

/**
 * Double ended Queue
     perfome both side :
        addFirst -offerFirst           addLast - offerLast
        removeFirst - pollFirst         removeLast - pollLast
        getFirst - peekFirst            getLast - peekLast

  */
