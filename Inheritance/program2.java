package Inheritance;

class ICC{

    ICC(){
        System.out.println("In Icc Constructor");
    }
}
class BCCI extends ICC{

    BCCI(){
        System.out.println("In BCCI Constroctor");
    }
}
class ICCClient{

    public static void main(String[] args) {
        
        BCCI obj = new BCCI();
    }
}