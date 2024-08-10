package Overloading;

class OverloadingDemo{

    void fun(int x){
        System.out.println(x);
    }
    void fun(float y){
        System.out.println(y);
    }
    void fun(OverloadingDemo obj){
        System.out.println("In OverloadingDemo Parameter");
        System.out.println(obj);
    }

    public static void main(String[] args){

        OverloadingDemo obj = new OverloadingDemo();

        obj.fun(10);
        obj.fun(25.4f);
        obj.fun(obj);
    }
}