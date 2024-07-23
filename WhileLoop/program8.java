package WhileLoop;

class ReverseDemo{
    public static void main(String[] args) {
        
        int N = 8946;

        while(N != 0){
            System.out.println(N % 10);
            N = N/10;
        }
    }
}