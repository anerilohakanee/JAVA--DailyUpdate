class JaggedArray{

    public static void main(String[] args) {
        
        int arr[][] = { {10,20,30}, {40,50}, {60} };
        

          for(int x[] : arr){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}