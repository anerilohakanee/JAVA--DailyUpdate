package Overloading;

class IPL{

    void matchInfo(String name1, String name2){
        System.out.println(name1 + " vs " + name2);
    }
    void matchInfo(String team1, String team2, String venue){
        System.out.println(team1 + " vs " + team2);
        System.out.println("venue : " + venue);
    }
}
class IPLClient{

    public static void main(String[] args) {
        IPL obj = new IPL();
        obj.matchInfo("GT", "CSK");
        obj.matchInfo("GT", "CSK", "NMSA");
    }
}