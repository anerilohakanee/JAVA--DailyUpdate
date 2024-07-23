import java.io.*;

class Pattern1{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of rows: ");
        int rows = Integer.parseInt(br.readLine());

        System.out.print("Enter the number of columns: ");
        int colm = Integer.parseInt(br.readLine());

        for (int i = 1; i <= rows; i++){
            for (int j = i; j < i + colm; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
