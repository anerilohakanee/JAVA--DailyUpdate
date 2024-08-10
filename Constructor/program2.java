package Constructor;

class College{

    int studNo = 1000;

    void fun(){
        System.out.println("Hello From Students");
    }

    public static void main(String[] args) {

        College obj = new College();
        obj.fun();
        
    }
}
