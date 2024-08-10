class StringBufferCapacity{

    public static void main(String[] args) {
        

        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());
        System.out.println(str);
        
        StringBuffer br = new StringBuffer("Shashi");
        System.out.println(br.capacity());
        System.out.println(br);

        br.append("Bagal");
        System.out.println(br.capacity());
        System.out.println(br);
    }
}