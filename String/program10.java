//Another String concatinated with the first String

class StringConcat{

    public static void main(String[] args) {
        
        String str1 = "Core2";   //will get the place on scp
        String str2 = "Web";      // will get the place on scp
        String str3 = str1.concat(str2);  //will get the place on Heap 

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}