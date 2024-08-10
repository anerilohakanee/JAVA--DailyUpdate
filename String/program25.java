class StringSplit{

    public static void main(String[] args) {

        String str = "Know the code till the core";
        
        String strResult[] = str.split(" ");
        
        for(int i=0; i<strResult.length; i++){
            System.out.println(strResult[i]);
        }
        }
}