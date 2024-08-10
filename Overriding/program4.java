package Overriding;

class ParentDemo{

    Object fun(){

        Object obj = new Object();
        System.out.println("In Parent fun");
        return obj;
    }
}
class ChildDemo extends ParentDemo{

    @Override
    public String fun(){
        System.out.println("In child fun");
        return "Aneri";
    }
}
class DemoClient{

    public static void main(String[] args) {
        
        ChildDemo obj = new ChildDemo();
        obj.fun();
    }
}
