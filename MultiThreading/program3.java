package MultiThreading;

class MyThread extends Thread{

    public void run(){

        System.out.println("In run");
        System.out.println(Thread.currentThread().getName());
    }
}
class MyDemo{

    public static void main(String[] args) {
        
        MyThread obj = new MyThread();
        obj.start();
        

        System.out.println(Thread.currentThread().getName());
    }
}
