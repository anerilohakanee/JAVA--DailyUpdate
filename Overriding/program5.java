
package Overriding;

class Parentstatic{

    Parentstatic(){
        System.out.println("In Parent Constructor");
    }
    static void fun(){
    System.out.println("In parent fun");
    }
}
class ChildStatic extends Parentstatic{
        
        ChildStatic(){
            System.out.println("In child constructor");
        }
        static void fun(){
            System.out.println("In Child fun");
        }
    }

class Chilentstatic{

    public static void main(String[] args) {

        Parentstatic obj = new ChildStatic();
        Parentstatic.fun();
    }
}