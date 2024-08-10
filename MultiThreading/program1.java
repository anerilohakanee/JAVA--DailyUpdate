package MultiThreading;

class MyThread extends Thread{

    public void fun(){
        for(int i = 0; i<10; i++){
            System.out.println("In run");
        }
    }
}
class MyThreadDemo{

    public static void main(String[] args) {
        
        MyThread obj = new MyThread();
        obj.start();

        for(int i=0; i<10; i++){
            System.out.println("In main");
        }
        obj.fun();
    }
}