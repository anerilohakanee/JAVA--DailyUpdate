class ThisDemo{

    int x = 10;
    ThisDemo(){

        System.out.println("In Constructor");
        System.out.println(this);
        System.out.println(this.x); 
    }
    void fun(){
        System.out.println(this);
        System.out.println(x);
    }
    public static void main(String[] args) {
        
        ThisDemo obj = new ThisDemo();
        System.out.println(obj);
        obj.fun();
    }
}