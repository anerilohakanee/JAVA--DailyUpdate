package CollectionClass;

import java.util.*;

class SortDemo{

    public static void main(String[] args){

        ArrayList al = new ArrayList();

        al.add("Badhe");
        al.add("Ashish");
        al.add("Shashi");
        al.add("Rahul");
        al.add("Kanha");
        al.add("Shashi");

        System.out.println("List before the use of" + 
                " Collections.sort() :\n" + al);

         Collections.sort(al);
         System.out.println("List after the use of" + 
              " Collections.sort() :\n" + al);
    }
}
