package InnerClass;

class StaticInnerOuter{

    void m1(){
        System.out.println("In M1-Outer");
    }

    static class Inner{

        void m2(){
            System.out.println("In M2-Inner");
        }
    }
    public static void main(String[] args) {
        
        StaticInnerOuter obj = new StaticInnerOuter();
        obj.m1();
    }
}

