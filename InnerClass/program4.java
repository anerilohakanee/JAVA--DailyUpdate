package InnerClass;

class AnnonymousOuter{

    void fun(){
        System.out.println("In Outer Fun");
    }

    class AnnonymousInner{

        void gun(){
            System.out.println("In Inner Gun");
        }
    }

}
class AnnonymousClient{

    public static void main(String[] args) {
        
        AnnonymousOuter obj = new AnnonymousOuter(){   //Annonymous class
    
        };
        AnnonymousOuter.AnnonymousInner obj1 = new AnnonymousOuter().new AnnonymousInner();
        obj.fun();
        obj1.gun();
    }
}