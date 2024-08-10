package Exception_Handling;

import java.io.*;

class ExceptionDemo{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str);

        int data = 0;

        try{
            data = Integer.parseInt(br.readLine());
            System.out.println(data);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException:Please enter integer data");
            data =  Integer.parseInt(br.readLine());
        }
        System.out.println(data);
        
    }
}
