package Set.TreeSet;

import java.util.*;

class MyClass implements Comparable<MyClass> {

    String str = null;

    // Constructor
    MyClass(String str) {
        this.str = str;
    }

    // compareTo method
    public int compareTo(MyClass obj) {
        return this.str.compareTo(obj.str);
    }

    // toString method
    public String toString() {
        return str;
    }
}

class TreeSetUser {
    public static void main(String[] args) {
        TreeSet<MyClass> ts = new TreeSet<>();

        ts.add(new MyClass("Kanha"));
        ts.add(new MyClass("Badhe"));
        ts.add(new MyClass("Ashish"));

        System.out.println(ts);
    }
}