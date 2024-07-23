package Scanner;

import java.util.Scanner;



class Solution{
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String input = null;
       for(int i=0; i<n; i++){
           
           try{
                input = sc.next();
                long a = Long.parseLong(input);
                System.out.println(a+" can be fitted in:");

                if(a>= Byte.MIN_VALUE && a<= Byte.MAX_VALUE){
                System.out.println("* byte");
           }
           
           if(a>= Short.MIN_VALUE && a<= Short.MAX_VALUE){
               System.out.println("* short");
           }

           if(a>= Integer.MIN_VALUE && a<= Integer.MAX_VALUE){
               System.out.println("* int");
           }
               System.out.println("* long");

       }catch(Exception e){
           System.out.println(input+" can't be fitted anywhere.");
       }
       }
    }
}