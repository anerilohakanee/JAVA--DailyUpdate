package Exception_Handling;

import java.util.*;

class ThrowDemo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        try{
            if(x == 0){
                throw new ArithmeticException("Divide by zero");
            }
            System.out.println(10/x);
        }catch(ArithmeticException e){
            System.out.println("Exception in thread " + Thread.currentThread().getName() + " ");
            e.printStackTrace();
        }
    }
}
