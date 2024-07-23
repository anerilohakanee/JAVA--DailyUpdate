class PerfectNum {

    public static void main(String[] args) {
        
        int N = 4;
        int sum = 0;

        for(int i=1; i<N; i++){
            if(N % i == 0){
                sum = sum + i;
            }
            if(sum == N){
                System.out.println("Perfect Number");
            }else{
                System.out.println("Not Perfect Number");
            }
        }
    }
    
}
