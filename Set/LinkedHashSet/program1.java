package Set.LinkedHashSet;
import java.util.*;

class LinkedHashSetDemo{

    public static void main(String[] args) {
        
        LinkedHashSet lhs = new LinkedHashSet<>();
      
        System.out.println(lhs.add("Kanha"));
        lhs.add("Rahul");
        lhs.add("Badhe");
        lhs.add("Ashish");
        lhs.add("Shashi");
        System.out.println(lhs.add("Kanha"));

        System.out.println(lhs);
    }
}