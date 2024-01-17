package MultiThreading;

import java.util.Random;

class MyCounter2 implements Runnable{
    private int threadNo;

    public MyCounter2(int threadNo) {
        this.threadNo = threadNo;
    }


    @Override
    public void run() {

        Random random=new Random();
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("value of i is: "+i+" and thread number is: "+threadNo);
        }
    }
}
public class Runnble {
    public static void main(String[] args) {
        /*Thread thread1=new Thread(new MyCounter2(1));
        Thread thread2=new Thread(new MyCounter2(2));

        thread1.start();
        thread2.start();*/

        new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<=10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("value of i is: "+i);
                }
            }
        }).start();


        //Thread t1=
        //t1.start();

    }
}
