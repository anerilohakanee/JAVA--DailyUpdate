package Abstraction_Interface;

abstract class Kitchen{

    Kitchen(){
        System.out.println("In Parent Constructor");
    }

    void tastyCurry(){
        System.out.println("All peoples likes curry");
    }
    abstract void recipe();
}
class FoodLover extends Kitchen{

    FoodLover(){
        System.out.println("In Child constructor");
    }

    @Override
    void recipe(){
        System.out.println("Ask to My Mom about recipe");
    }
}
class recipeClient{

    public static void main(String[] args) {
        
        FoodLover obj = new FoodLover();
        obj.tastyCurry();
        obj.recipe();
    }
}

