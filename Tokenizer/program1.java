import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TokenDemo{

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Socity name, Wing, FlatNo.");
        String info = br.readLine();

        System.out.println("Info :");

        StringTokenizer obj = new StringTokenizer(info, " ");

        String token1 = obj.nextToken();
        String token2 = obj.nextToken();
        String token3 = obj.nextToken();

        System.out.println("Socity : " +token1);
        System.out.println("Wing : " +token2);
        System.out.println("FlatNo. : " +token3);

    }
}