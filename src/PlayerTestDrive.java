public class PlayerTestDrive {
    public static void main(String [] args){
        System.out.println(Player1.playerCount);
        Player1 one = new Player1("Tiger Wooods");
        System.out.println(Player1.playerCount);
    }
}

class Player1{
    static int playerCount = 0;
    private String name;
    public Player1(String n){
        name = n;
        playerCount++;
    }
}