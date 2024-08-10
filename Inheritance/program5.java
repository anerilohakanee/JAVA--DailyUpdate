package Inheritance;

class StaticDemo{

    static int x = 10;
    int y = 20;

    static{
        System.out.println("In Parent Static block");
    }
    StaticDemo(){
        System.out.println("In Parent Constructor");
    }
    static void access(){
        System.out.println(x);
    }
    void access1(){
        System.out.println(y);
    }
}
class DemoChild extends StaticDemo{

    static{
        System.out.println("In child static block");
        System.out.println(x);
        access();
    }
    DemoChild(){
        System.out.println("In Child Constructor");
    }
}
class ClientDemo{

    public static void main(String[] args) {
        
        DemoChild obj = new DemoChild();
        obj.access1();

        StaticDemo.access();
    }
}