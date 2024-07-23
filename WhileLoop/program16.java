package WhileLoop;

class Factorial {
    
    public static void main(String[] args) {
        
        int fact = 1;
        int N = 6;

        while(N > 0){
            fact = fact * N;
            System.out.println(fact);
            N--;
        }
    }
}
