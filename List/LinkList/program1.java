package List.LinkList;

import java.util.*;

class LinkedListDemo{

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20.5f);
        ll.add("Aneri");
        ll.add(10);
        ll.add(20.5f);

        System.out.println(ll);                             //[10, 20.5, Aneri, 10, 20.5]

        System.out.println(ll.size());                       //5

        ll.set(3, "Lohakane");
        System.out.println(ll);                              //[10, 20.5, Aneri, Lohakane, 10, 20.5]

        System.out.println(ll.remove(3));             //Lohakane
        System.out.println(ll);                             // [10, 20.5, Aneri, 10, 20.5]

        System.out.println(ll.isEmpty());                   //false

        System.out.println(ll.indexOf(10));               //0
        System.out.println(ll.lastIndexOf(10));           //3

        System.out.println(ll.contains("Aneri"));         //true
        System.out.println(ll.contains(20));              //false

        System.out.println(ll.get(2));                //Aneri

        ll.clear();
        System.out.println(ll);                             //[]

        System.out.println(ll.isEmpty());                    //true


    }
    
}
