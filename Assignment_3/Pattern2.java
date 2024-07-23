import java.io.*;
class Pattern2{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of rows: ");
        int rows = Integer.parseInt(br.readLine());

        int count = 1;

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
	    System.out.println();
	}
    }
}
