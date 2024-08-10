package MultiThreading;

class MyThread extends Thread{

    public void run(){
        System.out.println(Thread.currentThread());
    }
}
class Democlient{

    public static void main(String[] args) throws InterruptedException{
        System.out.println(Thread.currentThread());
        
        MyThread obj = new MyThread();
        obj.start();

        Thread.sleep(2000);

        Thread.currentThread().setName("Core2Web");
        System.out.println(Thread.currentThread());

    }
}