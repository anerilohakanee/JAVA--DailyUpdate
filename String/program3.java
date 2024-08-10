class StrDemo{

    public static void main(String[] args) {
        
        String str = "Core2Web";
        String str1 = new String("Core2Web");

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));

        String str2 = new String("Core2web");
        String str3 = "Core2Web";
        
        
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

    }
}