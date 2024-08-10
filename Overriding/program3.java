package Overriding;

class Match{

    Match(){
        System.out.println("In Match Constructor");
    }

    void matchType(){
        System.out.println("T20/OneDay/Test");
    }
}
class IPLmatch extends Match{

    IPLmatch(){
        System.out.println("In IPLMatch Constructor");
    }

    @Override
    void matchType(){
        System.out.println("Test");
    }
}
class MatchClient{

    public static void main(String[] args) {
        
        
        IPLmatch obj1 = new IPLmatch();
        obj1.matchType();
    }
}