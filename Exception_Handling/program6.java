package Exception_Handling;

import java.util.*;

class ScholershipDueDateException extends RuntimeException{

    ScholershipDueDateException(String msg){
        super(msg);
    }
}
class MonthDemo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Month");
        System.out.println("Note: July < Month < December");

        //String LastMonth = December;

        String month = sc.next();

        List<String> validMonths = Arrays.asList("August", "September", "October", "November");

        if(validMonths.contains(month)){

            System.out.println("Your Application has been Approved !!");
        }
            else{
            throw new ScholershipDueDateException("Application Date is over");
        }
    }
}
