import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TwoDArray{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size for row:");
        int rowSize = Integer.parseInt(br.readLine());
        
        System.out.println("Enter size for column:");
        int columnSize = Integer.parseInt(br.readLine());

        int arr[][] = new int[rowSize][columnSize];

        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                System.out.println("Enter values for arr[" + i + " " + j + "] = ");
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The 2D array is :");

        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                System.out.print(arr[i][j] +  " ");
            }
        System.out.println();
        }
    }
}