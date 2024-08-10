package MultiThreading;

import java.util.concurrent.*;

class MyThread implements Runnable{

    int num;
    MyThread(int num){
        this.num = num;
    }
    public void run(){
        System.out.println(Thread.currentThread() + "start Thread :" + num);
        dailyTask();
        System.out.println(Thread.currentThread() + "End Thread: " +num);
    }
    void dailyTask(){
        try{
            Thread.sleep(8000);
        }catch(InterruptedException e){
            System.out.println("Exception Occurred");
        }
    }
}
class ThreadPoolDemo{

    public static void main(String[] args) {
        
        ExecutorService ser = Executors.newCachedThreadPool();

        for(int i=0; i<10; i++){
            MyThread obj1 = new MyThread(i);
            ser.execute(obj1);
        }
        ser.shutdown();
    }
}

