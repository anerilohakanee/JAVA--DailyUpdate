package Scanner;

import java.util.Scanner;

class ScannerDemo{
    
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Name :");

        String name = obj.next();
        System.out.println("Your Name is : " +name);

        System.out.println("Enter Your Age :");
        int age = obj.nextInt();
        System.out.println("Your Age is : " +age);

    }
}