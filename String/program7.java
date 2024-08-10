class str{

    public static void main(String[] args) {
        
        String str1 = "Aneri";
        String str2 = "Lohakane";

        System.out.println(str1 + str2);    //str1 + str2 calls append() method internally which is the method of StringBuilder class

        String str3 = "AneriLohakane";
        String str4 = str1 + str2;              //It will get perfom on rum time and hence will call new String on run time therefore new obj will get created and hence IdentityHashCode of Str3 and Str4 are different 

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}