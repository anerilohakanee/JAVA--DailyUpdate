import java.io.*;
class OddNumRange{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a StartIndex :");
		int s = Integer.parseInt(br.readLine());

		System.out.println("Enter a EndIndex : ");
		int e = Integer.parseInt(br.readLine());

		System.out.println("Odd numbers in the range from " + s + "to" + e + ":");

		for(int i=s; i<=e; i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}
}

