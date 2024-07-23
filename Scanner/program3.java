package Scanner;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Int, Double, String values: ");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();
        
         System.out.println("Int: " + i);
         System.out.println("Double: " + d);
         System.out.println("String: " + s);
    }
}

