

class  ForEachDemo {

    public static void main(String[] args){

        int arr[] = new int [] {1,2,3,4,5,6,7};

        System.out.println("..........For Loop..........");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("..........For Each Loop..........");
        for(int x : arr){
            System.out.println(x);
        }
        System.out.println("........................");
        for(float y : arr){
            System.out.println(y);
        }
    }
}
