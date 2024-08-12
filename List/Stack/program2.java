package List.Stack;

import java.util.*;
class StackDemo{

    int studId;
    String studeName;

    StackDemo(int studeId, String studeName){
        this.studId = studId;
        this.studeName = studeName;
    }

    public String toString(){
        return studeName;
    }
}
class StackUser{

    public static void main(String[] args) {
        
        Stack<StackDemo> s = new Stack<>();

        s.push(new StackDemo(1,"Aneri"));
        s.push(new StackDemo(2,"Bhakti"));
        s.push(new StackDemo(3, "Aishwarya"));

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s);

    }
}
