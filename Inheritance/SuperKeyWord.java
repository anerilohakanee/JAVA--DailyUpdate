package Inheritance;

class SuperKeyWord {

    int x = 10;
    static int y = 20;

    static{
        System.out.println("In Parent static block");
    }
    SuperKeyWord(){
        System.out.println("In Parent Constructor");
    }
}
class SuperKeyWordChild extends SuperKeyWord{

    int x = 100;
    static int y = 200;

    static{
        System.out.println("In child static block");
    }
    SuperKeyWordChild(){
        System.out.println("In child Constructor");
    }
    void access(){

        System.out.println(super.x);
        System.out.println(super.y);
        System.out.println(x);
        System.out.println(y);
    }
}
class SuperClient{

    public static void main(String[] args) {
        
        System.out.println("In Main");

        SuperKeyWordChild obj = new SuperKeyWordChild();
        obj.access();
    }
}
