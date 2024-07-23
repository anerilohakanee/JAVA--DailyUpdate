class FactCount {

    public static void main(String[] args) {
        
        int N = 6;
        int count = 0;
        for(int i=1; i<=N; i++
        ){
            if(N % i == 0){
                count = count+1; 
                System.out.println(count);
            }
        }
    }
    
}
