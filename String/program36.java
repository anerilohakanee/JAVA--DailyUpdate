class StringBufferToString{

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Know the code till the core");

        String str1 = "Core2Web";
        String str2 = sb.toString();
        String str3 = str2.concat(str1);

        System.out.println(str2);
        System.out.println(str3);
    }
}