package List.LinkList;

import java.util.*;
class ListDemo{

    int empId;
    String empName;

    ListDemo(int empId, String name){
        this.empId = empId;
        this.empName = empName;
    }
    public String toString(){
        return empName;
    }
    
}
class UserDefined{

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();

        ll.add(new ListDemo(12, "Aneri"));
        ll.add(new ListDemo(10, "Rashmi"));
        ll.add(new ListDemo(11, "Tejas"));
        ll.add(new ListDemo(8,"virat"));

        System.out.println(ll);
    }
}
