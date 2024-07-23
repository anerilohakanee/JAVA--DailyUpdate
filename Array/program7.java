
class RecursiveArray {

    static void fun(int arr[]){

        for(int x : arr){
            System.out.println(x);
        }
    }
        public static void main(String[] args){

            int arr[] = new int [] {1,2,3,4,5};
            for(int x : arr){
                System.out.println(x);
            }
            fun(arr);
        }
    }

    