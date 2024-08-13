package SortedSet;

import java.util.*;

class SortedSetDemo{

    public static void main(String[] args){

        // Create a SortedSet with TreeSet
        SortedSet<String> ss = new TreeSet<>();

        // Add elements to the set
        ss.add("Kanha");
        ss.add("Rahul");
        ss.add("Badhe");
        ss.add("Ashish");

        System.out.println("Original set: " + ss);
        
        SortedSet<String> subset = ss.subSet("Ashish", "Rahul");
        System.out.println("Subset: " + subset);

        SortedSet<String> headSet = ss.headSet("Kanha");
        System.out.println("headSet: " + headSet);

        SortedSet<String> tailSet = ss.tailSet("Badhe");
        System.out.println("tailSet: " + tailSet);

        String first = ss.first();
        System.out.println("first: " + first);

        String last = ss.last();
        System.out.println("last: " + last);
    }
}
