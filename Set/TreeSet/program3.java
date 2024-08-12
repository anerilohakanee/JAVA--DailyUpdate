package Set.TreeSet;

import java.util.*;
class Movies implements Comparable{

    String MovieName = null;
    float totCollection = 0.0f;


    Movies(String MovieName, float totCollection){
        this.MovieName = MovieName;
        this.totCollection = totCollection;
    }
    public int CompareTo(Object obj){
        return -(MovieName.compareTo(((Movies)obj).MovieName));
    }
    public String toString(){
        return MovieName;
    }
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
class SetDemo{

    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();

        ts.add(new Movies("Gadar2", 150.00f));
        ts.add(new Movies("OMG2", 120.00f));
        ts.add(new Movies("Jailer", 250.00f));
        ts.add(new Movies("OMG2", 120.00f));

        System.out.println(ts);
    }
}

