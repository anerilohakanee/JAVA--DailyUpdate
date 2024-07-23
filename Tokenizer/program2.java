import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class DepInfo{

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Department Name, HOD Name, Total count of Students, Academic Co-ordinator Name :");
        String depInfo = br.readLine();

        System.out.println("Department Info :");

        StringTokenizer obj = new StringTokenizer(depInfo, " ");

        String token1 = obj.nextToken();
        String token2 = obj.nextToken();
        String token3 = obj.nextToken();
        String token4 = obj.nextToken();

        System.out.println("Department Name: " +token1);
        System.out.println("HOD Name: " +token2);
        System.out.println("Total Count Of Students: " +token3);
        System.out.println("Academic Co-ordinator Name: " +token4);
    }
}