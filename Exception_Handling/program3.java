package Exception_Handling;

class FinallyDemo{

    void m1(){
        System.out.println("In m1");
    }
    void m2(){
        System.out.println("In m2");
    }
    public static void main(String[] args) {
        
        FinallyDemo obj = new FinallyDemo();
        obj.m1();
        obj.m2();
        obj = null;

    try{
        obj.m2();
    }catch(NullPointerException e){
        System.out.println("Exception Occured");
    }
    finally{
        System.out.println("Connection Closed");
    }
    System.out.println("End main");
}
}
