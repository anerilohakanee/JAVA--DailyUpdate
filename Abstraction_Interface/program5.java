package Abstraction_Interface;

interface Demo1{
    void fun();
}
interface Demo2{
    void gun();
}

interface Demo3 extends Demo1, Demo2{
    void run();
}
class DemoChild implements Demo1, Demo2, Demo3{
    
    @Override
    public void fun(){
        System.out.println("In fun");
    }
    @Override
    public void gun(){
        System.out.println("In gun");
    }
    @Override
    public void run(){
        System.out.println("In run");
    }
}
class Clientdemo{

    public static void main(String[] args) {
        
        DemoChild obj = new DemoChild();
        obj.fun();
        obj.gun();
        obj.run();
    }
}