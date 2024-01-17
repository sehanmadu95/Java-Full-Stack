package DeadLockConcept;

public class HowDeadLock {
    public static void main(String[] args) {
        String lock1="lock1";
        String lock2="lock2";

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Inside thread1 on lock1");

                    synchronized (lock2){
                        System.out.println("Inside thread1 on lock2");
                    }
                }
            }
        });


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Inside thread2 on lock1");

                    synchronized (lock1){
                        System.out.println("Inside thread2 on lock2");
                    }
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

    }

}
