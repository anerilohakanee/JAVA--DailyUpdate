//WAP to convert all even indices of string to uppercase and odd indices to lowercase :

class StringConversion {

	public static void main(String[] args){

		String str = "dFTbnSrOvryt";

        StringBuilder obj  = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (i % 2 == 0) {
                obj.append(Character.toUpperCase(ch));
            } else {
                obj.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(obj.toString());
	}
}

//Time complexity : O(N)
//Space complexity : O(1)i
