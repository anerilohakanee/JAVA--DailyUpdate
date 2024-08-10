package InnerClass;

class Outer{

    Outer(){
        System.out.println("In Outer constructor");
    }

    void run(){
        System.out.println("In outer run");
    }
      class Inner{

            Inner(){
                System.out.println("In Inner Constructor");
            }
            void fun(){
                System.out.println("In M1-Inner");
            }
            void gun(){
                System.out.println("In M2-Inner");
            }
        }
    }
class InnerOuter{

    public static void main(String[] args) {
        
        Outer obj = new Outer();
        obj.run();

        Outer.Inner obj1 = new Outer().new Inner();
        obj1.fun();
        obj1.gun();

    }
}