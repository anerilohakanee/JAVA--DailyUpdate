package List.ArrayList;

import java.util.*;

class ArrayListDemo{

    public static void main(String[] args){

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20.5f);
        al.add("Shashi");
        al.add(10);
        al.add(20.5f);

        System.out.println(al);

        //public int size()
        System.out.println(al.size());                          //5

        //boolean isEmpty()
        System.out.println(al.isEmpty());                       //false

        //boolean contains()
        System.out.println(al.contains("Shashi"));            //true
        System.out.println(al.contains(30));                  //false

        //indexOf()
        System.out.println(al.indexOf("Shashi"));             //2
        System.out.println(al.indexOf(20.5f));                //1

        //lastIndexOf()
        System.out.println(al.lastIndexOf(20.5f));            //4

        //E get(int)
        System.out.println(al.get(3));                    //10
        System.out.println(al.get(2));                    //Shashi

        //void add(int, E)
        al.add(3,"Aneri");
        System.out.println(al);                                //[10, 20.5, Shashi, Aneri, 10, 20.5]

        //void set(int, E)
        al.set(3, "Core2Web");
        System.out.println(al);                                //[10, 20.5, Shashi, Core2Web, 10, 20.5]

        //E remove(int)
        System.out.println(al.remove(3));                //Core2Web
        System.out.println(al);                                //[10, 20.5, Shashi, 10, 20.5]
        
        //void clear()
        //al.clear();
        //System.out.println(al);                               //[]

        //to Array()
        Object arr[] = al.toArray();
        for(Object data:arr){
            System.out.print(data + " ");
        }
        System.out.println();                                  //10 20.5 Shashi 10 20.5
    }
}