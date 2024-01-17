package MultiThreading;

class BankBOC{
    volatile public int balance=0;
    public void withdraw(int amout){
        synchronized (this){
            if (balance <= 0) {
                System.out.println("Waiting for Deposittng....");

                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

      balance=balance-amout;
        System.out.println("Withdrawal successful... Bye!!");
    }

    public void deposit(int amout){
        System.out.println("Account is top up by: "+amout);
        balance=balance+amout;
        synchronized (this){
            notifyAll();
        }
    }

}
public class WaitAndNotify {
    public static void main(String[] args) {
        BankBOC bankBOC=new BankBOC();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                bankBOC.withdraw(10);
            }
        });

        thread1.setName("Thread 1");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bankBOC.deposit(5000);
            }
        });

        thread2.start();

       }


}
/**
we can used inturreped method without using notify. catch interreptud exception
do futher things insid inturreptd catch block*/
