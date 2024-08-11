package List.ArrayList;

import java.util.ArrayList;

class User{

    int rollNo;
    String name;

    User(int rollNo , String name){

        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){           //If we not give the call to toString() method then output will be the address and not data in case of user defined ArrayList.
        return name;                    //In case of predefined methods of ArrayList they internally gives the call to toString() method so at that time no need to give call manually to toString() method.
    }
}

class ListDemo{

    public static void main(String[] args) {
        
        ArrayList obj = new ArrayList<>();

        obj.add(new User(1 , "Aneri"));
        obj.add(new User(2, "Kalyani"));
        obj.add(new User(3, "Pranali"));

        System.out.println(obj);
    }
}
