package Methods;

class statDemo{

    static void fun(){
        System.out.println("In static fun");
    }
    void gun(){
        System.out.println("In Non-Static gun");
    }
    public static void main(String[] args) {

        fun();

        statDemo obj = new statDemo();
        obj.gun();
        
    }
}
