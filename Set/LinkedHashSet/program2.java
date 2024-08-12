package Set.LinkedHashSet;

import java.util.*;
class LinkedHashSetDemo{

    int jerNo;
    String pName;

    LinkedHashSetDemo(int jerNo, String pName){
        this.jerNo = jerNo;
        this.pName = pName;
    }
    public String toString(){
        return pName;
    }
}
class LinkedHashSetUser{

    public static void main(String[] args) {
        
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add(new LinkedHashSetDemo(18, "Virat"));
        lhs.add(new LinkedHashSetDemo(7, "MSD"));
        lhs.add(new LinkedHashSetDemo(45, "Rohit"));
        lhs.add(new LinkedHashSetDemo(7, "MSD"));

        System.out.println(lhs);
    }
}
