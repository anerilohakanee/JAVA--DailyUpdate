package List.vector;

import java.util.*;
class VectorDemo{

    public static void main(String[] args) {
        
        Vector v = new Vector();

        v.add(10);
        v.add("Aneri");
        v.add(20);
        v.add(30.5f);
        v.add(40);

        System.out.println(v);                                       //[10, Aneri, 20, 30.5, 40]

        System.out.println(v.get(3));                           //30.5
        
        v.set(2, "Lohakane");
        System.out.println(v);                                        //[10, Aneri, Lohakane, 30.5, 40]

        System.out.println(v.remove(2));                        //Lohakane
        System.out.println(v);                                        //[10, Aneri, 30.5, 40]

        System.out.println(v.isEmpty());                              //false

        v.clear();
        System.out.println(v);                                        //[]

        System.out.println(v.isEmpty());                              //true
    }
}