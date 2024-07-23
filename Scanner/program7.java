package Scanner;

import java.util.Scanner;

class Non_Static {

    int fun(int x){
        return x + 10;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int values :");

        int x = sc.nextInt();
        
        Non_Static obj = new Non_Static();
        System.out.println(obj.fun(x));
    }
    
}
