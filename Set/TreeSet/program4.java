package Set.TreeSet;

import java.util.*;

class ArrayListDemo{

    public static void main(String[] args){

        ArrayList al = new ArrayList();

        al.add("Badhe");
        al.add("Ashish");
        al.add("Shashi");
        al.add("Rahul");
        al.add("Kanha");

        System.out.println(al);

        TreeSet ts = new TreeSet(al);
        System.out.println(ts);
    }
}