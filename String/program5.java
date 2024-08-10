class StringHashCode{

    public static void main(String[] args) {
        
        String str1 = "Core2Web";
        String str2 = new String("Core2Web");
        String str3 = "Core2Web";
        String str4 = "Core2Web";

        System.out.println(str1.hashCode());  //all will have same hashCode as hashCode is defined based on the content
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}