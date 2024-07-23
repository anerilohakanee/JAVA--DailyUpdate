package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BuildInfo{

    private static int flatNo;

    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Building Name : ");
        String buildName = br.readLine();
        
        System.out.println("Enter Wing Name : ");
        char wing = (char)br.read();
        //br.skip(1);

        System.out.println("Enter Flat Number : ");
        int flatNo = Integer.parseInt(br.readLine());

        System.out.println("Building Name is : " +buildName);
        System.out.println("Wing Name is : " +wing);
        System.out.println("Flat Number is : " +flatNo);
    }
}
