public class GuessGame {
    void startGame(){
        int traget = (int) (Math.random() * 10);
        System.out.println("Guess the number ?");
        Player one = new Player();
        Player two = new Player();
        Player three = new Player();

        boolean flag = false;
        while (!flag){
            System.out.print("Player one: ");
            one.guessNum();
            int g1 = one.n;
            System.out.print("Player two: ");
            two.guessNum();
            int g2 = two.n;
            System.out.print("Player three: ");
            three.guessNum();
            int g3 = three.n;
            if (g1 == traget ||g2 == traget || g3 == traget){
                flag = true;
            }
            else {
                System.out.println("Wrong Number,please try again！");
            }
            if (g1 == traget){
                boolean g1right = true;
            }
            else if (g2 == traget){
                boolean g2right = true;
            }
            else if (g3 == traget){
                boolean g3right = true;
            }
            else {
                break;
            }
        }
        System.out.println("YES,you got it! the number is: "+traget);
    }
}
