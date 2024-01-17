package MultiThreading;


class MyCounter extends Thread{
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    public void countMe(){
        for (int x=0;x<=10;x++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The value of x is: "+x+" and the thread number is: "+threadNo);
        }
    }

    @Override
    public void run() {
        countMe();
    }
}


public class App {
    public static void main(String[] args) {
        MyCounter c1=new MyCounter(1);
        MyCounter c2=new MyCounter(2);

        long startTime=System.currentTimeMillis();
        c1.start();//Run should be called by JVM
        System.out.println("******************");
        c2.start();

        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("Total Time Required for entire process: "+(endTime-startTime));



    }
}


/**
Thread: sub process inside major  process

Runnable thread: thread ready to be execute
Runing Thread:
Waiting or blocked thread:

new Thread() ----> Runnable State ---> Running State --->  Terminated/dead state
                                            ^
                                            Blocked/waiting state


New Thread() -> Start() -> Run() -> Sleep()/wait()/yeild() -> run() return*/
