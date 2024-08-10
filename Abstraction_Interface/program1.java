package Abstraction_Interface;

abstract class Parent{

    void carrier(){
        System.out.println("Doctor");
    }
    abstract void marry();
}
class Child extends Parent{

    @Override
void marry(){
    System.out.println("Darshan Raval");
}
}
class Clienr{
    public static void main(String[] args) {
        
        Child obj = new Child();
        obj.carrier();
        obj.marry();
    }
}
