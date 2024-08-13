package NavigableSet;

import java.util.*;

class NavigableSetDemo{

    public static void main(String[] args) {
        
        NavigableSet ns = new TreeSet<>();
        ns.add("Kanha");
        ns.add("Rahul");
        ns.add("Ashish");
        ns.add("Shashi");
        ns.add("Badhe");

        System.out.println(ns);

        //lower()
        System.out.println(ns.lower("Badhe"));

        //floor()
        System.out.println(ns.floor("Shashi"));                     //If found same or equal object then will return it otherwise returns null

        //ceiling()
        System.out.println(ns.ceiling("Ashish"));                   //returns same or biggaer value (=>)

        //higher()
        System.out.println(ns.higher("Rahul"));
        System.out.println(ns.higher("Ashish"));
        System.out.println(ns.higher("Shashi"));

        //pollFirst()
        System.out.println(ns.pollFirst());
        System.out.println(ns);

        //pollLast()
        System.out.println(ns.pollLast());
        System.out.println(ns);

        //headSet()
        System.out.println(ns.headSet("Badhe"));

        //tailSet()
        System.out.println(ns.tailSet("Kanha"));
    }
}
