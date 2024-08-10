package Inheritance;

class Parent{

    static{
        System.out.println("In Parent Static Block");
    }
}
class Child extends Parent{

    static{
        System.out.println("In child static Block");
    }
}
class StaticClient{

    public static void main(String[] args) {
        
        Child obj1 = new Child();
    }
}
