class StringCompare{

    public static void main(String[] args) {
        
        String str1 = "Tejas";
        String str2 = new String("Aneri");

        if(str1 == str2){             // == compares the IdentityHashCode
            System.out.println("IdentityHashCode is same");
        }
        else{
            System.out.println("IdentityHashCode is different");
        }
    }
}