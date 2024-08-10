
//StringBuffer is mutable and Synchronized

class StringBufferDemo{

    public static void main(String[] args) {
        
        StringBuffer br = new StringBuffer("Shashi");
        System.out.println(br);
        System.out.println(System.identityHashCode(br));

        br.append("Bagal");
        System.out.println(br);
        System.out.println(System.identityHashCode(br));
    }
}