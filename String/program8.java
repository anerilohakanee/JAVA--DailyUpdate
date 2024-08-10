class IntStringArr{

    public static void main(String[] args) {
        
        int arr[] = {'1', '2', '3'};     //If there is an integer array then it will prints the Reference address and not that array
        System.out.println(arr);

        char arr1[] = {'A', 'B', 'C'};
        System.out.println(arr1);           //If there is a char array then it will print the concat array of asigned array instead of printing Reference address

        String arr2[] = {"Aneri", "Jalindar", "Lohakane"};
        System.out.println(arr2);           //If there is a String array then it will prints the String package along with address
    }
}