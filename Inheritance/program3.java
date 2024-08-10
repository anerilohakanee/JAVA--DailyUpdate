package Inheritance;

class Parent{

    Parent(){
        System.out.println("In Parent Constructor");
    }
     static void parentProperty(){
        System.out.println("Flat, Car, Gold");
    }
}
class Child extends Parent{

    Child(){
    System.out.println("In Child Constructor");
    }
}
class ParentClient{

    public static void main(String[] args){

        Parent obj = new Child();
        Parent.parentProperty();
        
    }
}
