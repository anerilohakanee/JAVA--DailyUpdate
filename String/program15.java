class StringEquals{

    public static void main(String[] args) {
        
        String str1 = "Ashish";
        String str2 = "ashish";
        String str3 = new String("Ashish");

        System.out.println(str1.equals(str2));      //False
        System.out.println(str1.equals(str3));      //True
    }
}