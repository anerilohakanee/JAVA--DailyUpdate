

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EvenArray {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array Size : ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        int count = 0;

        for(int i=0 ; i < arr.length; i++){
            System.out.println("Enter values for arr[" + i + "]");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Even integers are :");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
                
            }
        }
    }
}
