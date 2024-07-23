

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Array_Buffered {
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter values for arr[" + i + "] : ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("The Array elements are : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
       
    }
}
