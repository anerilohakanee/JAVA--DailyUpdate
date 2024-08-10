package Constructor;

class MACD{

    int items = 45;
    String favDish = "Pizza";

    void menu(){

        String menu1 = "Non-Veg";
        String menu2 = "Veg";

        System.out.println(items);
        System.out.println(favDish);
    }

}
class Users{

    public static void main(String[] args) {
        
        System.out.println("In Users Main");

        MACD obj = new MACD();
        obj.menu();
    }
}
