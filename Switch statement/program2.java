class SwitchStatementDemo{

    public static void main(String[] args){

        String str = "Mon";
        switch (str) {
           case "Mon":
           System.err.println("Monday");             //we can write System.err.println() also instead of System.out.println()
           break;

           case "Tue":
           System.out.println("Tuesday");
           break;

           case "Wed":
           System.out.println("Wednesday");
           break;

           default :
           System.out.println("Sunday");
           break;
        }
    }
}