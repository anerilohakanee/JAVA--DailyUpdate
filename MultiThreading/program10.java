package MultiThreading;

class MyThread extends Thread{

    MyThread(ThreadGroup tg, String str){
        super(tg, str);
    }
    public void run(){
        //System.out.println(getName());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}
class ThreadGroupDemo{

    public static void main(String[] args) {

        ThreadGroup pthreadGP = new ThreadGroup("C2W");
        
        MyThread obj1 = new MyThread(pthreadGP, "C");
        MyThread obj2 = new MyThread(pthreadGP, "C++");
        MyThread obj3 = new MyThread(pthreadGP, "Java");
        MyThread obj4 = new MyThread(pthreadGP, "Python");

        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();

        ThreadGroup cthreadGP = new ThreadGroup("Incubator");

        MyThread obj5 = new MyThread(cthreadGP, "Fluuter");
        MyThread obj6 = new MyThread(cthreadGP, "SpringBoot");
        MyThread obj7 = new MyThread(cthreadGP, "ReactJs");

        obj5.start();
        obj6.start();
        obj7.start();

        //cthreadGP.interrupt();
    }
}