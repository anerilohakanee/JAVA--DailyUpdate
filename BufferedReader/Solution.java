package BufferedReader;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String value :");
        String str = br.readLine();
        
        System.out.println("Enter Double value:");
        double val = Double.parseDouble(br.readLine());
        
        System.out.println("Enter Integer value:");
        int x = Integer.parseInt(br.readLine());
        
        System.out.println("String:" +str);
        System.out.println("Double:" +val);
        System.out.println("Int:" +x);

    }
}