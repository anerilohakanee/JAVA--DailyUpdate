package Exception_Handling;

import java.util.*;

class DataOverFlowException extends RuntimeException{

    DataOverFlowException(String msg){
        super(msg);
    }
}
class DataUnderFlowException extends RuntimeException{

    DataUnderFlowException (String msg){
        super(msg);
    }
}
class ArrayDemo{

    public static void main(String[] args) throws DataUnderFlowException, DataOverFlowException{
        
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer value");
        System.out.println("Note: 0 < element < 100");

        for(int i=0; i<arr.length; i++){
            int data = sc.nextInt();

            if(data < 0)
            throw new DataUnderFlowException("Data is less than 0 ");

            if(data > 100)
            throw new DataOverFlowException("Data is grater than 100");

            arr[i] = data;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}