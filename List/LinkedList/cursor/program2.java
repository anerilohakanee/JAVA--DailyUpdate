package List.LinkedList.cursor;

import java.util.*;

import javafx.scene.Cursor;

class CursorDemo{

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        for(Object x : al){
            System.out.println(x.getClass().getName());
            System.out.println(al);
        }

        //Iterator

        Iterator cursor = al.iterator();
        System.out.println(al.getClass().getName());
        System.out.println(cursor.next());

        while(cursor.hasNext()){
            if("10".equals(cursor.next()));
            cursor.remove();
            }
            System.out.println(al);

            //ListIterator

            ListIterator litr = al.listIterator();
            System.out.println(litr.getClass().getName());

            while(litr.hasNext()){
                System.out.println(litr.next());
            }
            while(litr.hasPrevious()){
                System.out.println(litr.previous());
            }

            //Enumeration

            Vector v = new Vector();

            v.add("Ashish");
            v.add("Kanha");
            v.add("Rahul");
            v.add("Badhe");

            Enumeration cursors = v.elements();
            System.out.println(cursors.getClass().getName());

            while(cursors.hasMoreElements()){
                System.out.println(cursors.nextElement());
            }
    }
}