class Employee{

    int EmpId = 10;
    String name = "Kanha";

    static int y = 50;

    void empInfo(){

        System.out.println(EmpId);
        System.out.println(name);
        System.out.println(y);
    }
}
class MainDemo{

    public static void main(String[] args) {
        
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();

        obj1.empInfo();
        obj2.empInfo();

        System.out.println("--------------------");

        obj2.EmpId = 20;
        obj2.name = "Rahul";
        obj2.y = 5000;

        obj1.empInfo();
        obj2.empInfo();
    }
}