package Exception_Handling;

class Arthematic{

    public static void main(String[] args) {

        System.out.println("Start Main");

        try{
                System.out.println(10/0);
            }
            catch(ArithmeticException e){

                System.out.println("Arithmetic exception occurs");
            }
            System.out.println("End main");
        }
        
    }
   
