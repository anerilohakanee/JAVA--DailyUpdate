package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PlayerInfo{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Player Name :");
        String name1 = br.readLine();
        System.out.println("Player is :");

        System.out.println("Enter JerNo :");
        int jerNo = Integer.parseInt(br.readLine());
        System.out.println("Jersy Number is : " +jerNo);

        System.out.println("Enter Avg :");
        float avg = Float.parseFloat(br.readLine());
        System.out.println("Avg. is : " +avg);
        
    }

}