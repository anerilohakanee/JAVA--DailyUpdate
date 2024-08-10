package Constructor;

import java.util.*;

class Dominoz{

    Dominoz(){
        System.out.println("In constructor");
    }

    void orders(){

        System.out.println("In Orders Method");
    }
     public static void main(String[] args) {

        System.out.println("In main");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter order count :");
        int noOfOrders = sc.nextInt();

        Dominoz obj = new Dominoz();
        obj.orders();


    }
}