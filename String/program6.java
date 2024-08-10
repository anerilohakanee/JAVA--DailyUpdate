import java.util.*;

class StringScanner{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = new String(sc.next());

        System.out.println("String and IdentityHashCode are :");

        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));

        System.out.println(str2);
        System.out.println(System.identityHashCode(str2));

        System.out.println(str3);
        System.out.println(System.identityHashCode(str3));

    }
}