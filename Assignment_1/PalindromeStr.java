//WAP to check whether string is palindrome or not:

import java.io.*;
class PalindromeString {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String : ");
		String str = br.readLine();
		
		String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversedStr)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
	}
	}
}

//Time complexity : O(N)
//Space complexity : O(1)

