package MultiThreading;

class MyThread extends Thread{

    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("In run");

             try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception occured");
            }
        }
    }
}
class ThreadDemo{

    public static void main(String[] args)throws InterruptedException {
        
        MyThread obj = new MyThread();
        obj.start();

        for(int i=0; i<10; i++){
            System.out.println("In main");
            Thread.sleep(1000);
        }
    }
}