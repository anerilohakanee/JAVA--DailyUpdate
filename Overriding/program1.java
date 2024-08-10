package Overriding;

class OverridingParent{

    OverridingParent(){
        System.out.println("In Parent Constructor");
    }
    void property(){
        System.out.println("Flat, Car, Gold");
    }
    void marry(){
        System.out.println("Deepika");
    }
}
class OverridingChild extends OverridingParent{

    OverridingChild(){
        System.out.println("In child Constructor");
    }
    
    @Override
    void marry(){
        System.out.println("Alia");
    }
}
class OverridingClient{

    public static void main(String[] args) {
        
        OverridingChild obj = new OverridingChild();
        obj.property();
        obj.marry();
    }
}