class Strchar{

    public static void main(String[] args) {
        
        char[] str1 =  {'1','2','3'};          //internally calls to str1.toString();
        char[] str2 =  {'1','2','3'};

        System.out.println(System.identityHashCode(str1));  //IdentityHashCode prints an unique Id but before the call of IdentityHashCode, valueOf() get called
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1.toString());                   //array name will print an address
        
    }
}