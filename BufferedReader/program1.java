package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedDemo{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Your Name :");
        String name = br.readLine();
        System.out.println("Your Name is : " +name);

        System.out.println("Enter Your Age :");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Your Age is: " +age);
    }
}