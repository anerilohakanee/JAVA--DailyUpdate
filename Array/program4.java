

import java.util.Scanner;

class ArraySum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;
      
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter values for arr[" + i +"] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum array elements : ");

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            System.out.println(sum);
        }
    }
    
}
