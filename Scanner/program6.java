package Scanner;

import java.util.Scanner;

class StaticDemo {

    static void add(int a, int b){
        int ans = a + b;
        System.out.println("Addition =" +ans);
    }
    static void sub(int a, int b){
        int ans = a - b;
        System.out.println("Substraction = " +ans);
    }
    static void mult(int a, int b){
        int ans = a * b;
        System.out.println("Multiplication = " +ans);
    }
    static void div(int a, int b){
        int ans = a % b;
        System.out.println("Division = " +ans);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer values :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        add(a,b);
        sub(a, b);
        mult(a, b);
        div(a, b);
    }
    
}
