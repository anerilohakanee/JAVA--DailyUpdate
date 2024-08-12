package List.Stack;

import java.util.*;

class StackDemo{

    public static void main(String[] args) {
        
        Stack s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push("Shashi");
        s.push(30.5f);                    

        System.out.println(s);

        System.out.println(s.peek());            //It returns the top(front) of the collection without removing the element from the collection

        System.out.println(s.search(30.5f));     //1

        System.out.println(s.pop());  
        System.out.println(s);                      //[10, 20, Shashi]

        System.out.println(s.empty());              //false
    }
}