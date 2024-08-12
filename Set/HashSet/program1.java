package Set.HashSet;

import java.util.HashSet;

class HashSetDemo{

    public static void main(String[] args) {
        
        HashSet hs = new HashSet<>();

        System.out.println(hs.add("Kanha"));          //true
        hs.add("Rahul");
        hs.add("Badhe");
        hs.add("Ashish");
        hs.add("Shashi");
        System.out.println(hs.add("Kanha"));           //false
        
        System.out.println(hs);                          //[Rahul, Shashi, Ashish, Badhe, Kanha]

        hs.add(10);
        hs.add(20);
        System.out.println(hs);

        hs.add(new Integer(10));
        hs.add(new Integer(20));
        System.out.println(hs);
    }
}
