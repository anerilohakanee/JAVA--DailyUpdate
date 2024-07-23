package Scanner;

import java.util.Scanner;

class DemoScanner{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Dream Company Name :");
        String compName = sc.next();
        System.out.println("Your Dream Company is :");

        System.out.println("Enter Expected Package :");
        float pack = sc.nextFloat();
        System.out.println("Your Expected Package is :");
    }
}