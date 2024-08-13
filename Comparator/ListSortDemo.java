import java.util.*;

class Employee {

    String empName;
    float sal;

    Employee(String empName, float sal) {
        this.empName = empName;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "{" + empName + " : " + sal + "}";
    }
}

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee obj1, Employee obj2) {
        return obj1.empName.compareTo(obj2.empName);
    }
}

class SortBySal implements Comparator<Employee> {

    @Override
    public int compare(Employee obj1, Employee obj2) {
        return Float.compare(obj1.sal, obj2.sal);
    }
}

public class ListSortDemo {

    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee("Kanha", 200000.00f));
        al.add(new Employee("Rahul", 22000.00f));
        al.add(new Employee("Shashi", 120000.00f));
        al.add(new Employee("Badhe", 110000.00f));

        System.out.println("Original list: " + al);

        
        Collections.sort(al, new SortByName());
        System.out.println("Sorted by name: " + al);

        Collections.sort(al, new SortBySal());
        System.out.println("Sorted by salary: " + al);
    }
}
