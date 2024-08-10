package Abstraction_Interface;

interface Demo{

    void fun();
    void gun();
}
abstract class DemoChild implements Demo{

    @Override

    public void fun(){
        System.out.println("In fun");
    }
}

class DemoChild1 extends DemoChild{

    @Override
    public void gun(){
        System.out.println("In gun");
    }
}
class InterfaceClient{

    public static void main(String[] args) {
        
        DemoChild obj = new DemoChild1();
        obj.fun();
        obj.gun();
    }
}