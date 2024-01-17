package MultiThreading;

import com.sun.media.sound.AudioSynthesizer;

public class SynchronizationUnderConcurnt {
    public static int conter=0;
    public static void main(String[] args) {
         Thread thread=new Thread(new Runnable() {
             @Override
             public void run() {
                 for(int i=0;i<1000;i++){
                     SynchronizationUnderConcurnt.conter++;
                 }

                 System.out.println("End  Thread 1");
             }
         });


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    SynchronizationUnderConcurnt.conter++;
                }

                System.out.println("End  Thread 2");
            }
        });

         thread.start();
         thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(SynchronizationUnderConcurnt.conter);
    }
}

/**
 * Here convey some concurrent issue with acces same reasources simultaniously
 * Synchronize 3 types

Synchronize method
Synchronize block
static syncronize*/

