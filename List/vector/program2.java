package List.vector;

import java.util.Vector;

class CrickPlayer{

    int jerNo;
    String name;

    CrickPlayer(int jerNo, String name){
        this.jerNo = jerNo;
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

class VectorUser{

    public static void main(String[] args) {
        
        Vector v = new Vector<>();

        v.add(new CrickPlayer(7,"MSD"));
        v.add(new CrickPlayer(45, "Rohit"));
        v.add(new CrickPlayer(18, "Virat"));

        System.out.println(v);
    }
}