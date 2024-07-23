package WhileLoop;

class ReverseNum{

    public static void main(String[] args) {
        
        int N = 942111423;
        int rev = 0;
        while(N != 0){

            rev = rev * 10 + N % 10;
            N = N/10;
        }

            System.out.println(rev);
    }
}