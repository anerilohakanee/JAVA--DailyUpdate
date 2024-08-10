package MultiThreading;

class MyThread extends Thread{

    public static void main(String[] args) {

            Thread t = Thread.currentThread();
            System.out.println(t.getPriority());
        
        MyThread obj = new MyThread();
        obj.start();
         t.setPriority(7);
    }

 }