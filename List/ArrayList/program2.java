package List.ArrayList;

import java.util.ArrayList;

class User{

    int rollNo;
    String name;

    User(int rollNo , String name){

        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
        return name;
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
