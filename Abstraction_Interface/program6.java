package Abstraction_Interface;

interface VarDemo{

    int x = 10;
    void fun();
}

class Childdemo implements VarDemo{

    public void fun(){
        System.out.println(x);
        System.out.println(VarDemo.x);
    }
}
class demoClient{

    public static void main(String[] args) {
        
        Childdemo  obj = new Childdemo ();
        obj.fun();
    }
}