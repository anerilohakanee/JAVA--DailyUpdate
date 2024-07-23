package WhileLoop;

class DemoSum {

    public static void main(String[] args) {
        
        int N = 135;
        int sum = 0;

        while(N != 0){
            int rem = N % 10;
           
            System.out.println("rem =" +rem);
            sum = sum + rem;
            System.out.println("sum =" +sum);
            N = N/10;
        }
    }
    
}
