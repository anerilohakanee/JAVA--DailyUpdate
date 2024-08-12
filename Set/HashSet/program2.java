package Set.HashSet;

import java.util.*;
class HashSetDemo{

    int jerNo;
    String pName;

    HashSetDemo(int jerNo, String pName){
        this.jerNo = jerNo;
        this.pName = pName;
    }
    public String toString(){
        return pName;
    }
}
class HashSetUser{

    public static void main(String[] args) {
        
        HashSet hs = new HashSet();

        hs.add(new HashSetDemo(18, "Virat"));
        hs.add(new HashSetDemo(7, "MSD"));
        hs.add(new HashSetDemo(45, "Rohit"));
        hs.add(new HashSetDemo(7, "MSD"));

        System.out.println(hs);
    }
}
