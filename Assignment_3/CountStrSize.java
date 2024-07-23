
import java.io.*;
class CountStrSize{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String :");

		String str = br.readLine();

		int length = 0;

		for(int i=0; i<str.length(); i++){
			length++;
		}
		System.out.println("Length of String is : " + length);
	}
}


