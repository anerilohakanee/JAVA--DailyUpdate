//indexOf() finds the first instance of character in the given String

class StringIndexOf{

    public static void main(String[] args) {
        
        String str1 = "ZealEducation";

        System.out.println(str1.indexOf('e'));
        System.out.println(str1.indexOf('a' , 1));
        System.out.println(str1.indexOf('a' , 6));
        System.out.println(str1.indexOf('a' , 12));
    }
}