class PrimeNum {

    public static void main(String[] args) {
        
        int N = 5;
        int count = 0;

        for(int i=1; i<=N; i++){
            if(N % i == 0){
                count = count+1;
            }
            if(count == 2){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime Number");
            }
        }
    }
    
}
