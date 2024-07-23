package WhileLoop;

class PalindromNum {

    public static void main(String[] args) {
        
        int N = 2332;
        int rev = 0;
        int temp = N;

        while(N != 0){
            rev = rev * 10 + N % 10;
            N = N/10;

            if(temp == rev){
                System.out.println("Number is Palindrom");
            }
            else{
                System.out.println("Number is not Palindrom");
            }
        }
    }
    
}
