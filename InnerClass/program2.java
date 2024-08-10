package InnerClass;

class OuterDemo{

    void m1(){
        System.out.println("In M1-Outer");

        class InnerDemo{

            void m2(){
                System.out.println("In M2-Inner");
            }
        }
        InnerDemo obj2 = new InnerDemo();
        obj2.m2();
    }
    void m3(){
        System.out.println("In M3-Outer");
    }
}
class Client{
    
     public static void main(String[] args){
         
         OuterDemo obj = new OuterDemo();
            obj.m1();
            obj.m3();
     }
}



 
