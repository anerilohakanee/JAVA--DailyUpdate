package MultiThreading;

class Demo extends Thread{

    public void run(){
        System.out.println("Demo : " + Thread.currentThread().getName());
    }
}
class MyThread extends Thread{

    public void run(){
        System.out.println("MyThread : " +Thread.currentThread().getName());

        Demo obj = new Demo();
        obj.start();
    }
}
class DemoThread{

    public static void main(String[] args) {
        
        System.out.println("DemoThread : " +Thread.currentThread().getName());

        MyThread obj1 = new MyThread();
        obj1.start();
    }
}
